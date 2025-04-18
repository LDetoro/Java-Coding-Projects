import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String input;

        System.out.print("Enter name : ");
        input = scnr.nextLine();

        String initials = toInitials(input);

        System.out.println("For " + input + " initials are : " + initials);
        scnr.close();
    }

    public static String toInitials(String input) {
        int spaceCount = 0;
        String initials;
        int firstSpace;
        int secondSpace;

        // Find Spaces
        firstSpace = input.indexOf(" "); // 1 or 2 name
        if (firstSpace != -1) {
            spaceCount++;
        }

        secondSpace = input.lastIndexOf(" "); // 2 or 3 names
        if (secondSpace != firstSpace) {
            spaceCount++;
        }

        // Making String initials
        if (spaceCount == 0) // For 1 name
        {
            initials = input.charAt(0) + ".";
        }

        else if (spaceCount == 1) // For 2 names
        {
            initials = input.charAt(0) + ". " + input.charAt(firstSpace + 1) + ".";
        }

        else {
            initials = input.charAt(0) + ". " + input.charAt(firstSpace + 1) + ". " + input.charAt(secondSpace + 1)
                    + ".";
        }

        return initials;
    }

}
