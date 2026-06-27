package GeeksForGeeks.Module2_BitMagic;

public class Problem2_CountSetBits {

    public static int countSetBits (int num) {

        int count = 0;

        while (num>0) {
            num = num & (num-1);
            count++;
        }

        return count;
    }

    public static void main (String[] args) {

        // Expected Output: 2
        System.out.println(countSetBits(5));

        // Expected Output: 4
        System.out.println(countSetBits(15));

        // Expected Output: 3
        System.out.println(countSetBits(100));
    }
}
