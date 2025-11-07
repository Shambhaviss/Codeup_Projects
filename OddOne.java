import java.util.*;

public class OddOne {
    static int odd(int[] nums) {
        // check each number
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            // count how many times nums[i] appears
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // if it appears only once → return it
            if (count == 1) {
                return nums[i];
            }
        }

        return -1; // if no such number found
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

        int result = odd(nums);
        System.out.println("Odd one out number: " + result);
    }
}
