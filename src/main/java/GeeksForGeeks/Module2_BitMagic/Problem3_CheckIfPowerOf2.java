package GeeksForGeeks.Module2_BitMagic;

public class Problem3_CheckIfPowerOf2 {

    public static boolean checkIfPowerOf2 (int num) {

        if (num==0) {
            return false;
        }

        return ((num&(num-1))==0);
    }

    public static void main (String[] args) {

        // Expected Output: True
        System.out.println(checkIfPowerOf2(4));

        // Expected Output: True
        System.out.println(checkIfPowerOf2(64));

        // Expected Output: False
        System.out.println(checkIfPowerOf2(77));
    }
}
