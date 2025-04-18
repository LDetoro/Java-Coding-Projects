public class Tables
{
   public static double cornerAverage(double[][] values)
   {
      int rows = values.length;
      int columns = values[0].length;
      double sum = 0;
      
      double firstNum = values[0][0];
      double secondNum = values[rows - 1][columns - 1];
      double thirdNum = values[0][columns - 1];
      double fourthNum = values[rows - 1][0];

      sum = firstNum + secondNum + thirdNum + fourthNum;


      return sum / 4;
   }
}