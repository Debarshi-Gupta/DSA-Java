package Udemy.Module3_BitManipulation;

public class Problem6_CountingSetBits {

    public static int countSetBits (int num) {

        int count = 0;

        while (num>0) {
            num = num & (num-1);
            count++;
        }

        return count;
    }

    public static void main (String[] args) {

        // 1
        System.out.println(countSetBits(16));

        // 4
        System.out.println(countSetBits(15));

        // 2
        System.out.println(countSetBits(6));
    }
}
