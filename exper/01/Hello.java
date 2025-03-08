public class Hello{
public static void main(String args[]){
    System.out.print("Hello!");
    Student zhang=new Student();
    zhang.speak();

}
}
class Student{
    void speak(){
        System.out.print("I am a student.");
    }
}