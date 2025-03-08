//给Person类增加一个静态字段count和静态方法getCount()，统计实例创建的个数
public class TryStatic {
    public static void main(String[] args) {
        Person p1=new Person();
    Person p2=new Person();
    System.out.println(Person.count);
    }
    
}
class Person{
    static int count=0;
    public static int getCount(){
        return count;
    }
    public Person(){
        count++;
    }
}