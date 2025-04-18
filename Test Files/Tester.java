import java.util.Arrays;

public class Tester
{
   public static void main(String[] args)
   {
      int[] a = new int[4];
     // ArrayUtils.fill(a, 3);
      System.out.println("fill(a, 3): " + Arrays.toString(a));
      System.out.println("Expected: [3, 3, 3, 3]");

      a = new int[2];
     // ArrayUtils.fill(a, 42);
      System.out.println("\nfill(a, 42): " + Arrays.toString(a));
      System.out.println("Expected: [42, 42]");

      a = new int[0];
     // ArrayUtils.fill(a, -1);
      System.out.println("\nfill(a, -1): " + Arrays.toString(a));
      System.out.println("Expected: []");
   }
}