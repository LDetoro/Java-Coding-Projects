import java.util.ArrayList;

public class GetInRange {

    public static void main(String[] args) {
        ArrayList<Integer> myList1 = new ArrayList<>();
        myList1.add(1);
        myList1.add(2);
        myList1.add(3);
        myList1.add(4);
        myList1.add(5);
        System.out.println(getInRange(myList1, 2, 4)); // Output: [2, 3, 4]
        
        ArrayList<Integer> myList2 = new ArrayList<>();
        myList2.add(3);
        myList2.add(7);
        myList2.add(6);
        myList2.add(2);
        myList2.add(9);
        myList2.add(0);
        myList2.add(4);
        myList2.add(8);
        System.out.println(getInRange(myList2, 3, 10)); // Output: [3, 7, 6, 9, 4, 8]
        
        ArrayList<Integer> myList3 = new ArrayList<>();
        myList3.add(1);
        myList3.add(1);
        myList3.add(1);
        System.out.println(getInRange(myList3, 1, 1)); // Output: [1, 1, 1]
    }
    
    public static ArrayList<Integer> getInRange(ArrayList<Integer> numbers, int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int num : numbers) {
            if (num >= min && num <= max) {
                result.add(num);
            }
        }
        
        return result;
    }
}
