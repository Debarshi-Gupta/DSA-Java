package GeeksForGeeks.Module1_Mathematics;

public class Problem8_PrintPrimeFactors {

    public static void printPrimeFactors (int num) {

        if (num==1) {
            return;
        }

        for (int i=2; i*i<=num; i++) {
            while (num%i==0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num>1) {
            System.out.print(num);
        }
    }

    public static void main (String[] args) {

        // Expected Output: 2 3 3 5 5
        printPrimeFactors(450);

        System.out.println();

        // Expected Output: 2 2 3 7
        printPrimeFactors(84);

        System.out.println();

        // Expected Output: 13
        printPrimeFactors(13);
    }
}
