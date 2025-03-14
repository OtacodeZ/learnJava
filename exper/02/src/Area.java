import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("六边形的边长：");
        double s=scanner.nextDouble();
        double tanPi=Math.tan(Math.PI/6);
        double area=6*s*s/(4*tanPi);
        System.out.printf("边长为"+s+"的六边形面积为："+area);
    }
    
}
