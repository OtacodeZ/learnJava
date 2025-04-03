public class S3_6 {
    public static void main(String[] args) {
        Television t1=new Television();
        System.out.println(t1.No);
        Television t2=new Television();
        System.out.println(t2.No);

        t2.turn();
        System.out.println(t2.status);
        t2.turnDown();
        System.out.println(t2.volum);
        t2.change(78.3);
        System.out.println(t2.channel);;


    }
    
}

class Television{
    private static int Num=1;
    public final int No=Num;
    
    int status=0;
    int volum=10;
    double channel=0;

    public void turn(){
        if(1==status){
            status=0;
        }
        else
            status=1;
    }
    public void change(double channel){
        this.channel=channel;
    }
    public void turnUp(){
        volum++;
    }
    public void turnUp(int a){
        volum+=a;
    }
    public void turnDown(){
        volum--;
    }
    public void turnDown(int b){
        volum-=b;
    }
    public Television(){
        Num++;
    }
}