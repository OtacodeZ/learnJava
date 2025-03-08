import java.util.Scanner;

public class Sum{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入若干数，没输入一个数按回车确认，最后输入数字0结束输入操作");
        //为什么不能javac
        int sum=0;
        for(int i=0;i<10;i++){
            int n=scanner.nextInt();
            if(n!=0){
                sum+=n;
            }
            else break;
        }
        System.out.println("sum="+sum);
    }


}