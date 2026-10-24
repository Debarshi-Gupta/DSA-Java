package Udemy.Module3_BitManipulation;

public class Problem8_DecimalToBinary {

    public static int decimalToBinary (int num) {

        int result = 0;
        int powerOf10 = 0;

        while (num>0) {
            int remainder = num%2;
            result = (int) (result + (remainder * Math.pow(10, powerOf10)));
            powerOf10++;
            num /= 2;
        }

        return result;
    }

    public static void main (String[] args) {

        // 1111
        System.out.println(decimalToBinary(15));

        // 10000
        System.out.println(decimalToBinary(16));

        // 101
        System.out.println(decimalToBinary(5));
    }
}
