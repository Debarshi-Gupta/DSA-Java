package Udemy.Module3_BitManipulation;

public class Problem5_CheckPowerOf2 {

    public static boolean checkPowerOf2 (int num) {

        return (num & (num-1)) == 0;
    }

    public static void main (String[] args) {

        // True
        System.out.println(checkPowerOf2(128));

        // False
        System.out.println(checkPowerOf2(144));

        // True
        System.out.println(checkPowerOf2(1));
    }
}
