import java.util.Scanner;

public class Game {

//Objects
   static Scanner Reader = new Scanner(System.in);
   static Element Player = new Element();
   static Element computer = new Element();

    public static void PlayHand(){
        Player.Choose();
        computer.random();
        CheckWin();
    }

    public static void CheckWin(){

       System.out.println("Player shows " + Player.getChoice() + " & Computer shows " + computer.getChoice() );

       int outcome = Player.getRank() - computer.getRank();

       switch(outcome){
           case 2: System.out.println ("Computer Wins");
               break;

           case 1: System.out.println ("Player Wins");
               break;

           case -1: System.out.println ("Computer Wins");
               break;

           case -2: System.out.println ("Player Wins");
               break;

           case 0: System.out.println ("Draw, choose better next time.");
               break;

               default: System.out.println("WRONG");
       }

    }
    public static void main(String[] args) {
        boolean isPlaying = true;
     do{
         int Rounds = 1;
        do {
            System.out.println("\nIt is Round: " +Rounds);
            PlayHand();
            Rounds += 1;
        } while (Rounds < 11);
        System.out.println("Game Over, enter r to play again.");
        isPlaying = Reader.nextLine().equals("r");

    }while(isPlaying);
 }

}

