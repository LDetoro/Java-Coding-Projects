import java.util.ArrayList;

public class AllInBoth {
    
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(2);
        list2.add(9);
        list2.add(3);
        
        System.out.println(inBoth(list1, list2)); // Output: [2, 3]
        
        list1.clear();
        list1.add(3);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(1);
        list1.add(0);
        
        list2.clear();
        list2.add(0);
        list2.add(2);
        list2.add(9);
        list2.add(3);
        list2.add(5);
        list2.add(5);
        
        System.out.println(inBoth(list1, list2)); // Output: [3, 2, 5, 0]
        
        list1.clear();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        
        list2.clear();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        
        System.out.println(inBoth(list1, list2)); // Output: []
    }

    public static ArrayList<Integer> inBoth(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (Integer num : list1) {
            if (list2.contains(num) && !result.contains(num)) {
                result.add(num);
            }
        }
        
        return result;
    }
}
