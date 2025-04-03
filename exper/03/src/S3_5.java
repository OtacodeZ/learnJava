public class S3_5 {
    public static void main(String[] args) {
        Emplo e1=new Emplo(1,"a",18,"programing","IT");
        Emplo e2=new Emplo(2,"b",19,"plan","IT");
        e1.out();
        e2.out();
        e1.here();
        Emplo.hereNum();
    }
}

class Emplo{
    public int No;
    public String name;
    public int age;
    public String duty;
    public String sec;

    public void out(){
        System.out.printf("No=%d,name=%s,age=%s,duty=%s,section=%s\n",No,name,age,duty,sec);
    }

    static int num;
    public void here(){
        num++;
    }

    static void hereNum(){
        System.out.print(num);
    }
    Emplo(){

    }
    Emplo(int No,String name,int age,String duty,String sec){
        this.No=No;
        this.name=name;
        this.age=age;
        this.duty=duty;
        this.sec=sec;
    }
}