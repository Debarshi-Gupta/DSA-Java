package GeeksForGeeks.Module1_Mathematics;

public class Problem10_CalculatePower {

    public static int calculatePower (int num, int pow) {

        int result = 1;

        while (pow>0) {
            if (pow%2==1) {
                result *= num;
            }
            num *= num;
            pow /= 2;
        }

        return result;
    }

    public static void main (String[] args) {

        // Expected Output: 25
        System.out.println(calculatePower(5, 2));

        // Expected Output: 81
        System.out.println(calculatePower(3, 4));

        // Expected Output: 1024
        System.out.println(calculatePower(2, 10));
    }
}
