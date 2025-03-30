import java.util.Scanner;

public class Converter {
   public static void main(String[] args) {
     
      Scanner scnr = new Scanner(System.in);

      double input;
      String answer;

      System.out.print("Enter distance in Meters : "); // Collect and Declare Inputs
      input = scnr.nextDouble();

      answer = metersToFeetAndInches(input); // Call MetersToFeetAndInches method

      System.out.printf("%.2f meters is : %s", input, answer); // Print Output

      scnr.close();
   }

   public static String metersToFeetAndInches(double input) {
      double temp;
      int feet;
      double inches;

      temp = input * 39.37; // Conversion from to Meters to Feet
      feet = (int) (temp / 12);
      inches = temp % 12;

      String feetAndInches = String.format("%d\' %.2f\"", feet, inches); // Format into String
      return feetAndInches;
   }

}