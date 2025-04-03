//：创建一个抽象交通工具Vehicle类，它有 wheelNum 和 seatNum 两个成员变量以及抽象方法 
//display()。 类 Bus 和类 Motorcycle 继承自Vehicle类，实现打印成员变量的 display()方
//法。在主函数中分别生成Bus对象和Motorcycle对象，上转型为Vehicle对象调用 display()方法。
public class S4_4 {

    public static void main(String[] args) {
        Vehicle bus=new Bus();
        Vehicle motorcycle=new Motorcycle();
        bus.seatNum=30;
        bus.wheelNum=6;
        motorcycle.seatNum=2;
        motorcycle.wheelNum=2;
        bus.display();
        motorcycle.display();
    }
}

abstract class Vehicle{
    int wheelNum;
    int seatNum;
    abstract void display();
}
class Bus extends Vehicle{
    public void display(){
        System.out.println("wheelNum = "+wheelNum+ ",seatNum = "+seatNum);
    }
}
class Motorcycle extends Vehicle{
    public void display(){
        System.out.println("wheelNum = "+wheelNum+ ",seatNum = "+seatNum);
    }
}
