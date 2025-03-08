import java.util.Scanner;

public class Texi{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int km=scanner.nextInt();
        if(km<=2){
            System.out.println("you need pay " + 5 +"yuan");
        }
        else if(km<=9){
            double cost=5+(km-2)*1.3;
            System.out.println("you need pay " + cost +"yuan");
        }
        else{
            double cost=5+7*1.3+(km-7)*2+1;
            System.out.println("you need pay " + cost +"yuan");
        }
    }
}