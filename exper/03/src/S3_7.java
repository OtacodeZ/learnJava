public class S3_7 {
    public static void main(String[] args) {
        Student s1=new Student("xiangMing");

        Book b1=new Book("a", 5);
        Book b2=new Book("b", 0);
        Book b3=new Book("c", 2);
        Book b4=new Book("d", 1);
        
        Book.borrow(b4, s1);
        Book.borrow(b2, s1);
        Book.borrow(b3, s1);
        Book.borrow(b1, s1);

    }
    
}

class Book{
   
    
    String name;
    int status; //现在此书的数量
    public Book(String name,int status){
        this.name=name;
        this.status=status;
       

    }
   

    static  void borrow(Book b,Student s){
        
        
        if(s.c.balance>0&&b.status>0){
            System.out.println(s.name+"同学借到了"+b.name);
            s.c.balance--;

        }
        else if(s.c.balance<1)
            System.out.println("余额不足");
        else if(b.status<1){
            System.out.println("该书被借完了，下次再来吧");
        }

    }

}
class Card{
    int balance=2; //可借书的数量余额
    
    static private int num=1;
    public final int No=num;
    public Card(){
        num++;
    }
}

class Student{
    String name;
    Card c;
    public Student(String name){
        this.name=name;
        c=new Card();
    }

}