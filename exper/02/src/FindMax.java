import java.util.Scanner;

public class FindMax{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a,b,c;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        int max=a>b?a:b;
        max=max>c?max:c;
        System.out.println("Max="+max);

    }
}