package GeeksForGeeks.Module3_Recursion;

public class Problem9_PrintAllPermutations {

    public static void printAllPermutations (String s, int currentIndex) {

        if (currentIndex==s.length()) {
            System.out.print(s + " ");
            return;
        }

        for (int i=currentIndex; i<s.length(); i++) {
            s = swap(s, currentIndex, i);
            printAllPermutations(s, currentIndex+1);
            s = swap(s, currentIndex, i);
        }
    }

    public static String swap (String s, int i, int j) {

        char[] charArray = s.toCharArray();
        char tmp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = tmp;
        return new String(charArray);
    }

    public static void main (String[] args) {

        // Expected Output: ABC ACB BAC BCA CBA CAB
        printAllPermutations("ABC", 0);
    }
}
