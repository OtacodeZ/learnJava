public class TryMethod_1 {
    public static void main(String[] args) {
        Person p=new Person();
        p.age=17;
        p.name="qq";
        System.out.println(p.age+" and "+p.name);
        
    }
}
 class Person {
    public int age;
    public String name;
    public Person(int age,String name){
        this.age=age;
        this.name=name;

    }
    public Person(){

    }
 }
