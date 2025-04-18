import java.util.Arrays;

public class CopyHalf
{
   public static String[] copyHalf(String[] values)
   {
        int half = values.length / 2;

        return Arrays.copyOf(values, half);
   }
   
   public static void main(String[] args)
   {
        String[] arr1 = { "Mary", "had", "a", "little", "lamb" };
        System.out.println("Full Array 1: " + Arrays.toString(arr1));
        System.out.println("Half Array 1: " + Arrays.toString(copyHalf(arr1)));
      
        System.out.println();
      
        String[] arr2 = { "its", "fleece", "was", "white", "as", "snow" };
        System.out.println("Full Array 2: " + Arrays.toString(arr2));
        System.out.println("Half Array 2: " + Arrays.toString(copyHalf(arr2)));
   }
}