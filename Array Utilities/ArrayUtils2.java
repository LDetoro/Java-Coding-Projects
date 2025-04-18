public class ArrayUtils2
{
   /**
    * Returns an int array of length len, with 0 <= values < n.
    * @param len the size of the returned array.
    * @param n the upper (excluded) bounds of the random numbers.
    * @return the array as described here.
    */

   public static int[] randomInts(int len, int n)
   {
      int[] newArray = new int[len];

      for(int i = 0; i < newArray.length; i ++)
      {
         int randNum = 0;
         randNum = (int)(Math.random() * n);

         newArray[i] = randNum;
      }
      
      return newArray;
   }   
}