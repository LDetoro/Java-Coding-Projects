import java.util.Arrays;
public class Tester3
{
   public static void main(String[] args)
   {
      String[] in = {"mary", "had", "a", "little", "lamb"};
      String[] out = ArrayUtils.reverse(in);
      System.out.println("Input: " + Arrays.toString(in));
      System.out.println("Expected: [mary, had, a, little, lamb]");
      System.out.println("\nOutput: " + Arrays.toString(out));
      System.out.println("Expected: [lamb, little, a, had, mary]");
   }
}