public class DataTester
{
   public static void main(String[] args)
   {
      int[][] counts =
         {
            { 1, 0, 1 },
            { 1, 1, 0 },
            { 0, 0, 1 },
            { 1, 0, 0 },
            { 0, 1, 1 },
            { 0, 1, 1 },
            { 1, 1, 0 }
         };

      Data dataSet1 = new Data(counts);
      int sum = dataSet1.rowSum(5);
      System.out.println(sum);
      System.out.println("Expected: 2");

      int[][] magicSquare = {
         { 16, 3, 2, 13 },
         { 5, 10, 11, 8 },
         { 9, 6, 7, 12 },
         { 4, 15, 14, 1 },
      };

      Data dataSet2 = new Data(magicSquare);
      for (int row = 0; row <= 3; row++)
      {
         System.out.println(dataSet2.rowSum(row));
         System.out.println("Expected: 34");
      }
   }
}