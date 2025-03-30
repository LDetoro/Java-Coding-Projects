public class ArrayUtils
{
   /**
    * Fills an array with a particular value.
    * @param numbers the array of int
    * @param value the value to store in each element.
    */
       

   /*
      int[] a = new int[4];
      ArrayUtils.fill(a, 3);
      System.out.println("fill(a, 3): " + Arrays.toString(a));
      System.out.println("Expected: [3, 3, 3, 3]"); 
   */
   public static void fill(int[] numbers, int value)
   {
      for (int i = 0; i < numbers.length; i ++)
      {
         // int temp = numbers[i];
         numbers[i] = value;
         // temp = 0;
      }
   }

public static String[] reverse(String[] in) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'reverse'");
}
}