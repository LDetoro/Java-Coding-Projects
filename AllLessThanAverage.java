import java.util.ArrayList;

public class AllLessThanAverage {
    
    public static void main(String[] args) {
        ArrayList<Integer> myList1 = new ArrayList<>();
        myList1.add(1);
        myList1.add(2);
        myList1.add(3);
        myList1.add(4);
        myList1.add(5);
        System.out.println(lessThanAverage(myList1)); // Output: [1, 2]

        ArrayList<Integer> myList2 = new ArrayList<>();
        myList2.add(3);
        myList2.add(7);
        myList2.add(6);
        myList2.add(2);
        myList2.add(9);
        myList2.add(0);
        myList2.add(4);
        myList2.add(8);
        System.out.println(lessThanAverage(myList2)); // Output: [3, 2, 0, 4]
        
        ArrayList<Integer> myList3 = new ArrayList<>();
        myList3.add(1);
        myList3.add(1);
        myList3.add(1);
        System.out.println(lessThanAverage(myList3)); // Output: []
    }

    public static ArrayList<Integer> lessThanAverage(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        if (numbers == null || numbers.isEmpty()) {
            return result; // Return empty list for null or empty input
        }
        
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        double average = sum / numbers.size();
        
        for (int num : numbers) {
            if (num < average) {
                result.add(num);
            }
        }
        
        return result;
    }
}
