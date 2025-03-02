import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        String a="Rock",b="Paper",c="Scissors";
        String gamer;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your chioce,1 is Rock,2 is Paper,3 is Scissors");
        int gamerChioce = scanner.nextInt();
        gamer = switch (gamerChioce){
            case 1 -> a;
            case 2 -> b;
            case 3 -> c;
            default->{System.out.println("error");
            yield null ;}
        };
        switch (gamer){
        case "Rock" ->System.out.println("you win");
        case "Paper" ->System.out.println("you lose");
        default ->System.out.println("equals"); 
        }
        

    }
}