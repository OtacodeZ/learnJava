// while
public class TryWhile {
	public static void main(String[] args) {
		int sum = 0;
		int m = 20;
		int n = 100;
		// 使用while计算M+...+N:
        int x=20;
		while (x<=n) {
            sum+=x;
            x++;
		}
		System.out.println(sum);
	}
}