public class TableTester
{
   public static void main(String[] args)
   {
      double[][] a = { { 3, 1, 4 }, { 1, 5, 9 } };
      System.out.println(Tables.cornerAverage(a));
      System.out.println("Expected: 4.25");

      double[][] b = { { 3, 1 }, { 4, 1 }, { 5, 9 } };
      System.out.println(Tables.cornerAverage(b));
      System.out.println("Expected: 4.5");

      double[][] c = { { 3, 1, 4 }, { 1, 5, 9 }, { 2, 6, 5 } };
      System.out.println(Tables.cornerAverage(c));
      System.out.println("Expected: 3.5");      
   }
}