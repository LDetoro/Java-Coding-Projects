import java.util.Arrays;
public class Tester4
{
   public static void main(String[] args)
   {
      String[] a = {"mary", "had", "a", "little", "lamb"};
      ArrayUtils.reverse(a);
      System.out.println("After: " + Arrays.toString(a));
      System.out.println("Expected: [lamb, little, a, had, mary]");
      ArrayUtils.reverse(a);
      System.out.println("\nReversed again: " + Arrays.toString(a));
      System.out.println("Expected: [mary, had, a, little, lamb]");

      ArrayUtils.reverse(a);
      System.out.println("\nAgain: " + Arrays.toString(a));
      System.out.println("Expected: [lamb, little, a, had, mary]");
   }
}