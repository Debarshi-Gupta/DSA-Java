package Module_2_BinarySearch;

// https://leetcode.com/problems/koko-eating-bananas/description/

public class Problem7_KokoEatingBananas {

    public static void main (String[] args) {
        int[] piles = {30,11,23,4,20};
        System.out.println(minEatingSpeed(piles, 5));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int lb = 1;
        int ub = 1000000000;
        int ans = 1000000000;
        while (lb<ub) {
            int mid = (lb+ub)/2;
            int sum = 0;
            for (int i=0; i<piles.length; i++) {
                int value = piles[i]/mid;
                value = piles[i]%mid==0?value:value+1;
                sum += value;
            }
            if (sum<=h) {
                ans = mid;
                ub = mid;
            }
            else {
                lb = mid+1;
            }
        }

        return ans;
    }
}
