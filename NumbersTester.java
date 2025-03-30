import java.util.Arrays;

public class NumbersTester {
    public static void main(String[] args) {
        int[] a = { 3, 1, 4 };
        Numbers.swapFirstLast(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Expected: [4, 1, 3]");
        int[] b = { 3, 1, 4, 1, 5, 9 };
        Numbers.swapFirstLast(b);
        System.out.println(Arrays.toString(b));
        System.out.println("Expected: [9, 1, 4, 1, 5, 3]");
        int[] c = { 3, 1 };
        Numbers.swapFirstLast(c);
        System.out.println(Arrays.toString(c));
        System.out.println("Expected: [1, 3]");
        int[] d = { 3 };
        Numbers.swapFirstLast(d);
        System.out.println(Arrays.toString(d));
        System.out.println("Expected: [3]");
        int[] e = {};
        Numbers.swapFirstLast(e);
        System.out.println(Arrays.toString(e));
        System.out.println("Expected: []");
    }
}