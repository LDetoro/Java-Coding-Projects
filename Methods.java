package Labs;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int selection;
        do {
            System.out.print(
                    "\nMethod Selection Menu\n" +
                            "=======================\n" +
                            "1. Temperature Conversion (Fahrenheit to Celsius)\n" +
                            "2. Distance Conversion (Yards to Feet and Inches)\n" +
                            "3. Get Acronym\n" +
                            "4. Triangle Generator\n" +
                            "5. Exit\n" +
                            "=======================\n" +
                            "Enter selection (1-5): ");
            try {
                selection = Integer.parseInt(scnr.next());
            } catch (NumberFormatException ex) {
                selection = 0;
            }
            switch (selection) {
                case 1:
                    doTempConversion(scnr);
                    break;
                case 2:
                    doDistConversion(scnr);
                    break;
                case 3:
                    // flush input buffer
                    if (scnr.hasNextLine())
                        scnr.nextLine();

                    doGetAcronym(scnr);
                    break;
                case 4:
                    doTriangle(scnr);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Error: Invalid option");
            }
        } while (selection != 5);
        scnr.close();
    }

    public static void doTempConversion(Scanner scnr) {

        double fahr = 0;
        double celsius = 0;

        System.out.print("Enter the temperature in Fahrenhiet : "); // Collect Inputs
        fahr = scnr.nextDouble();

        celsius = fahrenheitToCelsius(fahr); // Call fahrenheitToCelsius method
        
        System.out.printf("%.2f degrees Fahrenheit is %.2f Celsius", fahr, celsius); // Print Results
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = 0;

        celsius = (5.0 / 9.0) * (fahrenheit - 32.0); // Fahrenheit to Celsius Conversion
        return celsius;
    }

    public static void doDistConversion(Scanner scnr) {

        double yards = 0;
        String feetAndInches = "";

        System.out.print("Enter distance in Yeads : "); // Collect Input
        yards = scnr.nextDouble();

        feetAndInches = yardsToFeetAndInches(yards); // Call yardsToFeetAndInches

        System.out.printf("%.2f yards in Feet and Inches is : %s", yards, feetAndInches); // Print results

    }

    public static String yardsToFeetAndInches(double yards) {
        double totalInches = yards * 36; // Yards to Feet and Inches conversion
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        return String.format("%d' %.2f\"", feet, inches);
    }

    public static void doGetAcronym(Scanner scnr) {

        String sentence = "";
        String acronym = "";

        System.out.print("Enter some words : "); // Collect Inputs
        sentence = scnr.nextLine();

        acronym = getAcronym(sentence); // Call getAcronym method

        System.out.printf("Acronym for %s : %s", sentence, acronym);
    }

    public static String getAcronym(String sentence) {

        String acronym = "";
        int indexOfSpace = 0;

        acronym += sentence.charAt(0);

        indexOfSpace = sentence.indexOf(" "); 

        while (indexOfSpace >= 0) { // Loop to Find Spaces
            acronym += sentence.charAt(indexOfSpace + 1);

            indexOfSpace = sentence.indexOf(" ", indexOfSpace + 1);
        }

        acronym = acronym.toUpperCase(); // Change all characters to upper case letters
        return acronym;
    }

    public static void doTriangle(Scanner scnr) {
    
        int size = 0;
        String border = "";
        String interior = "";

        System.out.print("Enter size     : "); // Collect Inputs
        size = scnr.nextInt();
        System.out.print("Enter border   : ");
        border = scnr.next();
        System.out.print("Enter interior : ");
        interior = scnr.next();
        
        for (int i = 1; i <= size; i++) { // Print Triangle based on user inputs
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1 || i == size)
                    System.out.print(border);
                else
                    System.out.print(interior);
            }
            System.out.println();
        }
    }

}