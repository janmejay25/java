import java.util.Scanner;
public class fistGame{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("rock, paper, scissors");
            System.out.println("player1 option: ");
            String player1 = sc.next();
            System.out.println("player2 option: ");
            String player2 = sc.next();
                
                if(player1.equals(player2)){
                    System.out.println("draw");
                }
                else if(player1.equals("rock") && player2.equals("scissors") || player1.equals("scissors") && player2.equals("paper") || player1.equals("paper") && player2.equals("rock")){
                    System.out.println("player1: " + player1);
                    System.out.println("player2: " + player2);
                    System.out.println("player1 wins");
                }
                else{
                    System.out.println("player1: " + player1);
                    System.out.println("player2: " + player2);
                    System.out.println("player2 wins");
                }
                if(!player1.equals("rock") && !player1.equals("scissors") && !player1.equals("paper") || !player2.equals("rock") && !player2.equals("scissors") && !player2.equals("paper")){
                    System.out.println("player1: " + player1 + " player2: " + player2);
                    System.out.println("invalid input");
                }
            System.out.println("do you want to play? (yes/no)");
            String play = sc.next();
            if(play.equals("no"))
            {
                System.out.println("thank you for playing");
                break;
            }
        }
        sc.close();
    }
}