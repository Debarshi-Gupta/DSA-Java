package Udemy.Module3_BitManipulation;

public class Problem2_SetClearUpdateBit {

    public static int setBit (int num, int index) {

        int mask = (1<<index);
        return num|mask;
    }

    public static int clearBit (int num, int index) {

        int mask = ~(1<<index);
        return num&mask;
    }

    public static int updateBit (int num, int index, int bit) {

        int result = clearBit(num, index);
        int mask = (bit<<index);
        return result|mask;
    }

    public static void main (String[] args) {

        // 7
        System.out.println(setBit(5, 1));

        // 1
        System.out.println(clearBit(5, 2));

        // 4
        System.out.println(updateBit(5, 0, 0));
    }
}
