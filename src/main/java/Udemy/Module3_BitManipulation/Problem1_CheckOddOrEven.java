package Udemy.Module3_BitManipulation;

public class Problem1_CheckOddOrEven {

    public static boolean checkEven(int num) {

        return (num&1)==0;
    }

    public static void main (String[] args) {

        // True
        System.out.println(checkEven(100));

        // False
        System.out.println(checkEven(1001));

        // True
        System.out.println(checkEven(0));
    }
}
