package GeeksForGeeks.Module1_Mathematics;

public class Problem9_PrintAllDivisors {

    public static void printAllDivisors (int num) {

        for (int i=1; i*i<=num; i++) {
            if (num%i==0) {
                System.out.print(i + " ");
            }
        }

        for (int i = (int) Math.sqrt(num); i>=1; i--) {
            if (num%i==0 && i*i!=num) {
                System.out.print(num/i + " ");
            }
        }
    }

    public static void main (String[] args) {

        // Expected Output: 1 2 3 4 6 12
        printAllDivisors(12);

        System.out.println();

        // Expected Output: 1 5 25
        printAllDivisors(25);

        System.out.println();

        // Expected Output: 1 2 4 5 10 20 25 50 100
        printAllDivisors(100);
    }
}
