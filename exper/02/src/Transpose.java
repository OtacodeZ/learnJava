import java.util.Arrays;
public class Transpose {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] b=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[j][i]=a[i][j];
            }
        }
        System.out.println("转置前"+Arrays.deepToString(a));
        System.out.println("转置后"+Arrays.deepToString(b));
    }
}