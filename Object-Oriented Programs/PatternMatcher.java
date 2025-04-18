package Labs;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PatternMatcher {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String fileName = "";
        ArrayList<String> wordList;

        System.out.print("Enter a file name to search in : ");
        fileName = scnr.next();

        try {
            wordList = getWordList(fileName);
        }

        catch (FileNotFoundException e) {
            System.out.println("Error: File not found, exiting...");
            scnr.close();
            return;
        }

        scnr.nextLine();
        System.out.println("File read successfully, initiating pattern matcher...");

        String pattern = "";
        System.out.print("Enter a pattern to match (or press Enter to exit): ");
        pattern = scnr.nextLine();

        while (pattern.length() > 0) {
            System.out.println(getMatches(wordList, pattern));
            System.out.print("Enter a pattern to match (or press Enter to exit): ");
            pattern = scnr.nextLine();
        }

        System.out.println("Exiting...");
        scnr.close();
    }

    public static ArrayList<String> getWordList(String fileName) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<String>();

        // Open the file, read the words
        FileInputStream file = new FileInputStream(fileName);
        Scanner fileScnr = new Scanner(file);

        while (fileScnr.hasNext()) {
            String newWord = fileScnr.next();
            words.add(newWord);
        }

        fileScnr.close();
        return words;
    }

    public static boolean isMatchAtIndex(String word, String pattern, int index) {
        if (index < 0 || index > word.length() - 1 || index > pattern.length() - 1)
            return false;

        if (pattern.charAt(index) == '_' || pattern.charAt(index) == word.charAt(index))
            return true;

        return false;
    }

    public static boolean isMatch(String word, String pattern) {
        if (word.length() != pattern.length())
            return false;

        for (int i = 0; i < word.length(); i++) {
            if (!isMatchAtIndex(word, pattern, i))
                return false;
        }

        return true;
    }

    public static ArrayList<String> getMatches(ArrayList<String> wordList, String pattern) {
        ArrayList<String> matches = new ArrayList<String>();

        for (String word : wordList) {
            if (isMatch(word, pattern))
                matches.add(word);
        }

        return matches;
    }

}