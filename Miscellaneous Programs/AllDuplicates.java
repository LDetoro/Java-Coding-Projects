import java.util.ArrayList;

public class AllDuplicates {
    
    public static void main(String[] args) {
         ArrayList<Integer> myList1 = new ArrayList<>();
        myList1.add(1);
        myList1.add(2);
        myList1.add(3);
        myList1.add(4);
        myList1.add(5);
        System.out.println(getDuplicates(myList1)); // Output: []

        ArrayList<Integer> myList2 = new ArrayList<>();
        myList2.add(3);
        myList2.add(2);
        myList2.add(3);
        myList2.add(1);
        myList2.add(4);
        myList2.add(2);
        myList2.add(1);
        myList2.add(3);
        myList2.add(0);
        System.out.println(getDuplicates(myList2)); // Output: [3, 2, 1]

        ArrayList<Integer> myList3 = new ArrayList<>();
        myList3.add(1);
        myList3.add(1);
        myList3.add(1);
        System.out.println(getDuplicates(myList3)); // Output: [1]
    }

    public static ArrayList<Integer> getDuplicates(ArrayList<Integer> numbers) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        
        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            boolean isDuplicate = false;
            boolean alreadyAdded = false;
            
            for (int j = 0; j < i; j++) {
                if (numbers.get(j).equals(current)) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (isDuplicate) {
                for (int num : duplicates) {
                    if (num == current) {
                        alreadyAdded = true;
                        break;
                    }
                }
                
                if (!alreadyAdded) {
                    duplicates.add(current);
                }
            }
        }
        
        return duplicates;
    }
}
