public class TryMethod_2 {

    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p.age+" and "+p.name);
    }
}
class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, 18); // 调用另一个构造方法Person(String, int)
    }

    public Person() {
        this("Unnamed"); // 调用另一个构造方法Person(String)
    }
}