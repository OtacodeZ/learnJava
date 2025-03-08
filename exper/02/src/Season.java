import java.util.Scanner;

public class Season{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("please input month:");
        int month=scanner.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:System.out.println("it is spring");break;
            case 6:
            case 7:
            case 8:System.out.println("it is summer");break;
            case 9:
            case 10:
            case 11:System.out.println("it is autumn");break;
            case 12:
            case 1:
            case 2:System.out.println("it is winter");break;
        }


    }
}