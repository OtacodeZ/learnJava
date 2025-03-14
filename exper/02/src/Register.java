import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String userName;
        do{
            System.out.print("请输入用户名（不少于3个字符）");
            userName=scanner.nextLine();
            if(userName.length()<3)
                System.out.println("输入少于3个");        
        }while(userName.length()<3);
        
        String password1;
        String password2;
        do{
            do{
            System.out.print("请输入密码（不少于6个字符）");
            password1=scanner.nextLine();
            if(password1.length()<6)
                System.out.println("输入少于6个");        
        }while(password1.length()<6);

        do{
            System.out.print("确认密码（不少于6字符）");
           password2=scanner.nextLine();
            if(password2.length()<6)
                System.out.println("输入少于6个");        
        }while(password2.length()<6);

            if(password1.equals(password2))
                break;
            else {
                System.out.println("两次输入的不一样");
            }
                
        }while(true);
        
   

    }
    
}
