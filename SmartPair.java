import java.util.Scanner;

public class SmartPair{
    public static boolean finder(int[] nums, int k){

        for( int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++) {
                int t = nums[i] +nums[j]; //SUm of two numbers
                if (t == k ) {
                    System.out.println("Pair found: " + nums[i] + " + " + nums[j] + " = " + k);
                return true;
                }
            } 
        }
        return false; // if no such number found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("enter the target:" );
        int k = sc.nextInt();

        boolean result = finder(nums,k);
            System.out.println(result);
        
    }
}
