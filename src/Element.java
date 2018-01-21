import java.util.Scanner;

public class Element {

    private int Rank;
    private String Choice;

 public Element(){

 }

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        Rank = rank;
    }

    public String getChoice() {
        return Choice;
    }

    public void setChoice(int rank) {

     switch(rank){
         case 0: Choice = "Rook";
         break;

         case 1: Choice = "Pap";
             break;

         case 2: Choice = "Scis";
         break;

         default: Choice = "Invalid";
     }
    }
    public void Choose(){
     Scanner Reader = new Scanner(System.in);
        System.out.println("Choose your hand: 0.Rook 1.Pap 2.Scis");

        Rank = Reader.nextInt();
        setChoice(Rank);
    }
    public void random(){
     Rank = (int)(Math.random() * 3);
     System.out.println("computer is Choosing");
     setChoice(Rank);
    }
}
