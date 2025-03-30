

public class AverageAndSum {

    public static void main(String[] args) {
        int[] myArray1 = {1, 2, 3, 4, 5};
        int[] myArray2 = {3, 7, 6, 2, 9, 0, 4, 8};
        int[] myArray3 = {1, 1, 1};
        
        System.out.println(java.util.Arrays.toString(averageAndSum(myArray1))); // Output: [3.0, 15.0]
        System.out.println(java.util.Arrays.toString(averageAndSum(myArray2))); // Output: [4.875, 39.0]
        System.out.println(java.util.Arrays.toString(averageAndSum(myArray3))); // Output: [1.0, 3.0]
    }

    public static double[] averageAndSum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new double[]{0.0, 0.0}; // Handle empty or null arrays
        }
        
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        double average = sum / numbers.length;
        return new double[]{average, sum};
    }
    
}
