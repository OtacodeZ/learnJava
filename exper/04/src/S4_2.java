public class S4_2 {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="A";
        s.no=03;
        s.introduce();
    }
}

class  Person{
     String name;
    int age;
    public final  void speak(){
        System.out.println("hello");
    }
}
class Student extends Person{
 int no;
 public void speak(){
    System.out.println("hi");
 }
 public void introduce(){
    super.speak();
    System.out.println("i am "+name+" and my No is "+no);
 }   
}