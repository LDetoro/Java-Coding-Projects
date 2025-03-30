public class zeroesDistanceTester
{
   public static void main(String[] args)
   {
      double[] a = { 3, 0, 1, 0, 4 };
      System.out.println(zeroesDist.zeroesDistance(a));
      System.out.println("Expected: 2");
      double[] b = { 0, 3, 0, 1, 0, 4 };
      System.out.println(zeroesDist.zeroesDistance(b));
      System.out.println("Expected: 4");
      double[] c = { 3, 0, 1, 0, 2, 3, 0, 4 };
      System.out.println(zeroesDist.zeroesDistance(c));
      System.out.println("Expected: 5");
      double[] d = { 0, 0, 0, 0, 0 };
      System.out.println(zeroesDist.zeroesDistance(d));
      System.out.println("Expected: 4");
      double[] e = { 3, 1, 4 };
      System.out.println(zeroesDist.zeroesDistance(e) < 0);
      System.out.println("Expected: true");
      double[] f = { };
      System.out.println(zeroesDist.zeroesDistance(f) < 0);
      System.out.println("Expected: true");
   }
}