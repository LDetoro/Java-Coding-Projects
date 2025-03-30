public class Range {

    public static void main(String[] args) {
        int[] myArray1 = {1, 2, 3, 4, 5};
        int[] myArray2 = {3, 7, 6, 2, 9, 0, 4, 8};
        int[] myArray3 = {1, 1, 1};
        
        System.out.println(range(myArray1)); // Output: 4
        System.out.println(range(myArray2)); // Output: 9
        System.out.println(range(myArray3)); // Output: 0
    }

    public static int range(int[] data) {
        int result = 0;

        int max = data[0];
        int min = data[0];
        
        for (int num : data) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        result = max - min;

        return result;
    }
    
}
