package GeeksForGeeks.Module1_Mathematics;

public class Problem7_CheckPrime {

    public static boolean checkPrime (int num) {

        if (num==1) {
            return false;
        }

        for (int i=2; i*i<=num; i++) {
            if (num%i==0) {
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args) {

        // Expected Output: True
        System.out.println(checkPrime(2));

        // Expected Output: True
        System.out.println(checkPrime(17));

        // Expected Output: False
        System.out.println(checkPrime(25));
    }
}
