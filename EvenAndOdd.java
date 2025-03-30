public class EvenAndOdd {

    public static void main(String[] args) {
        int[] myArray1 = {1, 2, 3, 4, 5};
        int[] myArray2 = {3, 7, 6, 2, 9, 0, 4, 8};
        int[] myArray3 = {1, 1, 1};
        
        System.out.println(java.util.Arrays.toString(evenAndOdd(myArray1))); // Output: [3, 2]
        System.out.println(java.util.Arrays.toString(evenAndOdd(myArray2))); // Output: [3, 5]
        System.out.println(java.util.Arrays.toString(evenAndOdd(myArray3))); // Output: [3, 0]
    }

    public static int[] evenAndOdd(int[] numbers) {
        
        if (numbers == null || numbers.length == 0) {
            return new int[]{0, 0}; // Handle empty or null arrays
        }
        
        int oddCount = 0;
        int evenCount = 0;
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        return new int[]{oddCount, evenCount};
    }
    
}
