package thirty_day_challenge_april;

public class JumpGame {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (nums[0] >= n-1) return true;
        int j = 1;
        for (int i=0; i<n;) {
            int jumpLength = nums[i];
            int maxJump = Integer.MIN_VALUE;
            int bestJ = -1;
            for (; j<=i+jumpLength; j++) {
                if (maxJump <= j+nums[j]) {
                    bestJ = j;
                    maxJump = j+nums[j];
                }
                if (maxJump >= n-1)
                    return true;
            }
            if (maxJump == Integer.MIN_VALUE)
                return false;
            else {
                j = i+jumpLength+1;
                i = bestJ;
            }
            System.out.println(i);
        }
        return true;
    }
}
