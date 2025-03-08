import java.util.Scanner;

public class Days{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("please input year and month:");
        int year=scanner.nextInt();
        int month=scanner.nextInt();

        if(month!=2){
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:System.out.println("has 31 days");return;
                default:System.out.println("has 30 days");return;
            }
        }
        if(year%4==0&&year%100!=0)
            System.out.println("has 29 days");
        else if(year%400==0)
            System.out.println("has 29 days");
        else
            System.out.println("has 29 days");



    }
}