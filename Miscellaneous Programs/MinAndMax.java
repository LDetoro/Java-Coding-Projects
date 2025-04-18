public class MinAndMax {
    
    public static void main(String[] args) {
        int[] myArray1 = {1, 2, 3, 4, 5};
        int[] myArray2 = {3, 7, 6, 2, 9, 0, 4, 8};
        int[] myArray3 = {1, 1, 1};
        
        System.out.println(java.util.Arrays.toString(maxAndMin(myArray1))); // Output: [5, 1]
        System.out.println(java.util.Arrays.toString(maxAndMin(myArray2))); // Output: [9, 0]
        System.out.println(java.util.Arrays.toString(maxAndMin(myArray3))); // Output: [1, 1]
    }

    public static int[] maxAndMin(int[] data) {
        int[] minAndMax = new int[2];

        minAndMax[1] = data[0]; // Max
        minAndMax[0] = data[0]; // Min

        for (int value : data) {
            if (value < minAndMax[1]) // Find Max
                minAndMax[1] = value;

            if (value > minAndMax[0]) // Find min
                minAndMax[0] = value;
        }

        return minAndMax;
    }
}
