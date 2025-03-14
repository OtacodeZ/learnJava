public class Eggs {

    public static void main(String[] args) {
        int x=1;
        while(x!=0){
            if(x%2==1)
            if(x%3==0)
                if(x%4==1)
                    if(x%5==1)
                        if(x%6==3)
                            if(x%7==0)
                                if(x%8==1)
                                    if(x%9==0){
                                        System.out.println("最少有"+x+"个");
                                        return;
                                    }
            x++;
        }
        
                            
    }
}