import java.util.Scanner;

public class MinimalistPainter {

    // Function to calculate minimal painting time
    public static int minimalPaintingTime(int[] time) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        // Calculate total sum and find maximum time
        for (int t : time) {
            sum += t;
            if (t > max) {max = t;
        }
        }
        // Subtract the largest wall time
        return sum - max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter number of walls:");
        int n = sc.nextInt();// take input

        int[] time = new int[n];
        System.out.println("Enter time for each wall:");
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();//take time (input)
        }

        int result = minimalPaintingTime(time);
        System.out.println("Minimum total time: " + result);

        sc.close();
    }
}
