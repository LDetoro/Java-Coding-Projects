package Labs;

public class Arrays {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 4, 7, 11 };
        int[] minAndMax = getMinAndMax(myArray);
        System.out.println("Sum of odds: " + sumOfOdds(myArray));
        System.out.println("Min: " + minAndMax[0]);
        System.out.println("Max: " + minAndMax[1]);
        System.out.println("Range: " + range(myArray));
        System.out.println("Second Largest: " + getSecondLargest(myArray));

    }

    public static int sumOfOdds(int[] data) {
        int sum = 0;

        for (int value : data) {
            if (value % 2 == 1) {
                sum += value;
            }
        }
        return sum;
    }

    public static int[] getMinAndMax(int[] data) {
        int[] minAndMax = new int[2];

        minAndMax[0] = data[0];
        minAndMax[1] = data[0];

        for (int value : data) {
            if (value < minAndMax[0])
                minAndMax[0] = value;

            if (value > minAndMax[1])
                minAndMax[1] = value;
        }

        return minAndMax;
    }

    public static int range(int[] data) {
        int result = 0;

        int[] minAndMax = getMinAndMax(data);

        result = minAndMax[1] - minAndMax[0];

        return result;
    }

    public static int getSecondLargest(int[] data) {
        int largest = data[0];
        int secondLargest = data[1];

        if (largest < secondLargest) {
            largest = data[1];
            secondLargest = data[0];
        }

        for (int value : data) {
            if (value > largest)
                largest = value;
        }

        for (int value : data) {
            if (value > secondLargest && value != largest)
                secondLargest = value;
        }
        return secondLargest;
    }

    public static int[] getDifferences(int[] data)
    {
        int[] diffs = new int[data.length - 1];

        for (int i = 0; i < data.length - 1; i++)
        {
            diffs[i] = data[i + 1] - data[i];
        }

        return diffs;
    }
}
