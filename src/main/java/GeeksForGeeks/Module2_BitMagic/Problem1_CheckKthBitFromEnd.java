package GeeksForGeeks.Module2_BitMagic;

public class Problem1_CheckKthBitFromEnd {

    public static int checkKthBitFromEnd (int num, int k) {

        int value = (int) Math.pow(2, (k-1));

        if ((num&value)!=0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main (String[] args) {

        // Expected Output: 1
        System.out.println(checkKthBitFromEnd(5, 3));

        // Expected Output: 0
        System.out.println(checkKthBitFromEnd(13, 2));

        // Expected Output: 1
        System.out.println(checkKthBitFromEnd(3, 2));
    }
}
