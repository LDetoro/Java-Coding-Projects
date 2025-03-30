import java.util.Scanner;

public class TempConversion {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		double fTemp;
		double kTemp;

		System.out.print("Enter temperature in Fahrenheit : "); // Collect Input
		fTemp = scnr.nextDouble();

		kTemp = fahrenheitToKelvin(fTemp); // Call fahrenheitToKelvin Method

		System.out.printf("%.2f degrees from Fahrenheit to Kelvin is %.2f\n", fTemp, kTemp); // Print results

		scnr.close();
	}

	public static double fahrenheitToKelvin(double fTemp) {
		double kTemp;
		kTemp = (fTemp - 32) * 5 / 9 + 273.15; // Fahrenheit to Kelvin Conversion
		return kTemp;
	}
}