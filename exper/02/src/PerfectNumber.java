public class PerfectNumber {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
            int sum=0;
            for(int p=1;p<i;p++){
                if(i%p==0){
                    sum+=p;
                    
                }
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
