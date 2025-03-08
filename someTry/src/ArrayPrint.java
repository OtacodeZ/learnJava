import java.util.Arrays;

public class ArrayPrint {
    public static void main(String[] args) {
        String[] ns = { "banana", "apple", "pear" };
        System.out.println(Arrays.toString(ns));
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));

    }
}