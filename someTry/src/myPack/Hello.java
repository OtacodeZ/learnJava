package myPack;

public class Hello {
    public static void main(String[] args) {
        myPack.Person p = new Person();
        p.hello(); // 可以调用，因为Main和Person在同一个包
    }
}
