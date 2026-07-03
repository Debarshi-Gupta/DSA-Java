package GeeksForGeeks.Module3_Recursion;

public class Problem6_TowerOfHanoi {

    public static void printTowerOfHanoi (int n, char A, char B, char C) {

        if (n==1) {
            System.out.println("Move Disk 1 From " + A + " To " + C);
            return;
        }

        printTowerOfHanoi(n-1, A, C, B);

        System.out.println("Move Disk " + n + " From " + A + " To " + C);

        printTowerOfHanoi(n-1, B, A, C);
    }

    public static void main (String[] args) {

        // Expected Output:
        // Move Disk 1 From A To C
        // Move Disk 2 From A To B
        // Move Disk 1 From C To B
        // Move Disk 3 From A To C
        // Move Disk 1 From B To A
        // Move Disk 2 From B To C
        // Move Disk 1 From A To C
        printTowerOfHanoi(3, 'A', 'B', 'C');
    }
}
