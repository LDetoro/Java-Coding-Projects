public class Main { // MinMaxDiff
    public static void main(String[] agrs) {
       // you may write code in this main method to test your required method   
        
       int total;
       total = minMaxDiff(1, 2, 3); // Should return 2
       //total = minMaxDiff(50, 10, 20); // Should return 40
       //total = minMaxDiff(1, 1, 1); // Should return 0
       //total = minMaxDiff(50, 100, 10); // Should return 90

       System.out.println(total);
    }
    
    // define your required method here below
    public static int minMaxDiff(int num1, int num2, int num3)
    {
        int diff = 0;
        int min = 0;
        int max = 0;

        // Find max
        if (num1 > num2 && num1 > num3)
        {
            max = num1;
        }
        
        else if (num2 > num1 && num2 > num3)
        {
            max = num2;
        }
        
        else
        {
            max = num3;
        }

        // Find min
        if (num1 < num2 && num1 < num3)
        {
            min = num1;
        }
        
        else if (num2 < num1 && num2 < num3)
        {
            min = num2;
        }
        
        else
        {
            min = num3;
        }
        
        // Calc diff
        diff = (max - min);
        
        return diff;
    }
}
