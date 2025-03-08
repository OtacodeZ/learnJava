public class Loop{
    public static void main(String args[]){
        double x=0;
        int i=1;

        do {
            x+=1.0/factorial(i);
            i++;
        }while(i<=20);
        System.out.println("1+/2!+1/3!=...+1/20!="+x);

    }
    static int factorial(int n){
        int x=1;
        for(int i=1;i<=n;i++){
            x*=i;
        }
        return x;

    }
}