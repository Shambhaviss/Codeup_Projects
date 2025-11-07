import java.util.Scanner;

public class SumStandOut{

    public static int findBalanceIndex(int[] nums) {
        int totalSum = 0;

        //  Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        //  Traverse each index
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i]; // exclude current element

            if (leftSum == rightSum) {
                return i; // found the balance index
            }

            leftSum += nums[i];
        }

        //No balance index found
        return -1;
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

        int result = findBalanceIndex(nums);

        if (result != -1)
            System.out.println("Index where prefix sum = suffix sum: " + result);
        else
            System.out.println("No such index found.");
    }
}
