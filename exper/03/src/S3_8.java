import java.util.Scanner;

public class S3_8 {
    public static void main(String[] args) {
        Account account=new Account(23104120,"xiaoming",2000,"23j34j232d");
        Atm test=new Atm();
        test.list[0]=account.No;
        test.logIn(account);

    }
}
class Account{
    int No;
    String name;
    int balance;
    String password;
    public Account(int No,String name,int balance,String password){
        this.No=No;
        this.name=name;
        this.balance=balance;
        this.password=password;
    }



}

class Atm{

    final int MAX=100;
    int[] list=new int[MAX];
    Scanner scanner=new Scanner(System.in);
    public void logIn(Account a){
        System.out.print("account:");

        int tAccount=scanner.nextInt();
        scanner.nextLine();
        System.out.print("password:");
        String tPassword=scanner.nextLine();
        if(a.No==tAccount&&a.password.equals(tPassword))
            while(true){
                System.out.print("存钱输入1，取钱输入2,退出输入0\n");//
                int s=scanner.nextInt();
                switch (s){
                    case 1:this.deposit(a);break;
                    case 2:this.draw(a);break;
                    default:break;
                }
                if(s!=1&&s!=2)
                break;
                
            }


        else
            System.out.println("密码或账户信息错误");//
    }

    private void deposit(Account a){
        System.out.print("存入金额：");//
        int m=scanner.nextInt();
        a.balance+=m;
        System.out.println("余额："+a.balance);
    }
    private void draw(Account a){
        System.out.print(" 取出金额：");//
        int m=scanner.nextInt();
        a.balance-=m;
        System.out.println("余额："+a.balance);
    }
}