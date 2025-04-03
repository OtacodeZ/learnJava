public class S3_4 {
    public static void main(String[] args) {
        fraction f1=new fraction(2,8);
        f1.out();
        f1.add(1,4);
        f1.out();
        f1.sub(1,3);
        f1.out();
        f1.mul(2,18);
        f1.out();
        f1.divi(1,18);
        f1.out();

    }
}
class fraction{
    public int ch;
    public int mo;
    public void add(int ch1,int mo1){
        int tmo=mo*mo1;
        int tch=ch*mo1+ch1*mo;
        this.mo=tmo;
        this.ch=tch;
        this.simple();
    }
    public void sub(int ch1,int mo1){
        int tmo=mo*mo1;
        int tch=ch*mo1-ch1*mo;
        this.mo=tmo;
        this.ch=tch;
        this.simple();
    }
    public void mul(int ch1,int mo1){
        this.mo=mo*mo1;
        this.ch=ch*ch1;
        this.simple();
    }
    public void divi(int ch1,int mo1){
        this.mo=mo*ch1;
        this.ch=ch*mo1;
        this.simple();
    }
    public void out(){
        System.out.println(ch+"/"+mo);
    }

    private void simple(){
        int g=gcd(ch,mo);
        ch/=g;
        mo/=g;
    }
    private int gcd(int a,int b){
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public fraction(){
        this.simple();
    }
    public fraction(int ch,int mo){
        this.ch=ch;
        this.mo=mo;
        this.simple();
    }

}