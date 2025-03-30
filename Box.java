import java.util.Scanner; //Import Scanner

public class Box {
     public static void main(String[] args) {

          Scanner scnr = new Scanner(System.in);

          int height;
          int width;
          char interior;
          char border;

          System.out.print("Enter width : "); // Collect Inputs
          width = scnr.nextInt();

          System.out.print("Enter height : ");
          height = scnr.nextInt();

          System.out.print("Enter interior : ");
          interior = scnr.next().charAt(0);

          System.out.print("Enter border : ");
          border = scnr.next().charAt(0);

          scnr.close(); // Close Scanner

          // Display Box:
          for (int i = 0; i < width; i++) // Print top border
          {
               System.out.print(border);
          }
          System.out.println(); // Start new line

          for (int i = 0; i < height - 2; i++) {
               System.out.print(border); // Print left border
               for (int j = 0; j < width - 2; j++) // Print interior chars
               {
                    System.out.print(interior);
               }
               System.out.print(border); // Print right border

               System.out.println(); // Start new line
          }
          for (int i = 0; i < width; i++) // Print print border
          {
               System.out.print(border);
          }
     }
}
