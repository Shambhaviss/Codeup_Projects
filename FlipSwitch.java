import java.util.Scanner;

public class FlipSwitch {

    // This method calculates the minimum flips to make all elements same
    static int flip(int[] nums) {
        int countZero = 0;
        int countOne = 0;

        // Count how many 0s and 1s are in the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                countZero++;
            else if (nums[i] == 1)
                countOne++;
            else
                System.out.println("Invalid input: only 0 or 1 allowed at index " + i);
        }

        // Print what should be flipped for clarity
        if (countZero < countOne) {
            System.out.println("Flip all 0s to make array all 1s.");
        } else if (countOne < countZero) {
            System.out.println("Flip all 1s to make array all 0s.");
        } else {
            System.out.println("Both sides equal — flip either all 0s or all 1s.");
        }

        // Return minimum number of flips required
        return Math.min(countZero, countOne);
    }

    public static   void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements (only 0 or 1):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = flip(nums);
        System.out.println("Minimum flips needed: " + result);
    }
}
    
