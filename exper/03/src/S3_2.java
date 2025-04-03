import java.util.Scanner;
public class S3_2{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入 0 进入int模式，输入 1 进入double模式");
        int c=scanner.nextInt();
        if(1==c){
            System.out.println("input a and b");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        System.out.println("1->+ \n 2-> - \n 3-> * \n 4-> /");
        int ch=scanner.nextInt();

        switch (ch){
            case 1:System.out.println(Calculator.add(a,b));break;
            case 2:System.out.println(Calculator.sub(a,b));break;
            case 3:System.out.println(Calculator.mul(a,b));break;
            case 4:System.out.println(Calculator.divi(a,b));break;
        }
        }
        else if(0==c){
            System.out.println("input a and b");
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println("1->+ \n 2-> - \n 3-> * \n 4-> /");
            int ch=scanner.nextInt();
    
            switch (ch){
                case 1:System.out.println(Calculator.add(a,b));break;
                case 2:System.out.println(Calculator.sub(a,b));break;
                case 3:System.out.println(Calculator.mul(a,b));break;
                case 4:System.out.println(Calculator.divi(a,b));break;
        }
         }

        }
}
class Calculator{
    static int add(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        //subtract
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static double divi(int a,int b){
        return (double)a/b;
    }
    static double add(double a,double b){
        return a+b;
    }
    static double sub(double a,double b){
        //subtract
        return a-b;
    }
    static double mul(double a,double b){
        return a*b;
    }
    static double divi(double a,double b){
        return a/b;
    }
}