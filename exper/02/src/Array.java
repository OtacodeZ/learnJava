import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a={1,2,3,43,5,34,5,4,23,234,23,4,3243,324};
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入查找内容");
        int x=scanner.nextInt();
        for(int i=0;i<a.length;i++){
            if(x==a[i]){
                System.out.println("存在，下标为"+i);
                return;
            }
        }
        System.out.println("不存在");
    }
    
}
