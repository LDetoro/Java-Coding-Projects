public class CountGreaterThanAverage {

    public static void main(String[] args) {
        int[] myArray1 = {1, 2, 3, 4, 5};
        int[] myArray2 = {3, 7, 6, 2, 9, 0, 4, 8};
        int[] myArray3 = {1, 1, 1};
        
        System.out.println(countGreaterThanAvg(myArray1)); // Output: 2
        System.out.println(countGreaterThanAvg(myArray2)); // Output: 4
        System.out.println(countGreaterThanAvg(myArray3)); // Output: 0
    }
    
    public static int countGreaterThanAvg(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0; // Handle empty or null arrays
        }
        
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        double average = sum / numbers.length;
        int count = 0;
        
        for (int num : numbers) {
            if (num > average) {
                count++;
            }
        }
        
        return count;
    }
}
