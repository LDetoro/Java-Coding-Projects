public class ArrayUtils4
{
   /**
    * Reverses the order of the elements in an array.
    * @param words an array of String to reverse.
    */

   public static void reverse(String[] words)
   {
      for (int i = 0; i < words.length; i++)
      {
        if (i >= words.length / 2)
            break;

        String temp = words[i];
        words[i] = words[words.length - 1 - i];
        words[words.length - 1 - i] = temp;
      }
   }

}