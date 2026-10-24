package Udemy.Module3_BitManipulation;

public class Problem7_FastExponentiation {

    public static int fastExponentiation (int num, int pow) {

        int result = 1;

        while (pow>0) {
            if ((pow&1)!=0) {
                result *= num;
            }
            num *= num;
            pow = pow>>1;
        }

        return result;
    }

    public static void main (String[] args) {

        // 125
        System.out.println(fastExponentiation(5, 3));

        // 1000
        System.out.println(fastExponentiation(10, 3));

        // 0
        System.out.println(fastExponentiation(0, 100));
    }
}
