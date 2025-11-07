import java.util.Scanner;

public class TravelerEnergy {

    public static int farthestCity(int[] cost, int initialEnergy) {
        int currentEnergy = initialEnergy;

        // Traverse through cities
        for (int i = 0; i < cost.length; i++) {
            currentEnergy -= cost[i];

            // If energy drops below 0, traveler cannot reach this city
            if (currentEnergy < 0) {
                return i; // number of cities successfully reached
            }
        }

        // If loop completes, traveler can reach all cities
        return cost.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();

        int[] cost = new int[n];
        System.out.println("Enter energy cost for each city:");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        System.out.print("Enter initial energy: ");
        int initialEnergy = sc.nextInt();

        int result = farthestCity(cost, initialEnergy);

        System.out.println("Traveler can reach " + result + " cities before running out of energy.");

        sc.close();
    }
}
