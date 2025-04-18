public class Numbers {
   public static void swapFirstLast(int[] values) {
      int first = 0;
      int last = values.length - 1;
      int tempVal = 0;

      if (values.length > 0) {
         tempVal = values[first]; // a = { 3, 1, 4 };
         values[first] = values[last];
         values[last] = tempVal;
      }

      return;
   }
}