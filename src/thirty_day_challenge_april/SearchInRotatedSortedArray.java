package thirty_day_challenge_april;

import java.util.Arrays;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int n = nums.length;

        // base cases
        if (n == 0) return -1;
        if (n == 1) return (nums[0] == target) ? 0 : -1;

        int r = -1;
        int mid = -1;
        for (int hi=n-1, lo=0; hi>=lo;) {
            mid = (hi+lo) >> 1;
            if (mid+1 < n && nums[mid] > nums[mid+1]) {
                r = mid;
                break;
            } else if (nums[mid] >= nums[lo]) {
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        // if such a point of rotation doesn't exist, the array was never rotated
        if (r == -1)
            r = n-1;

        int res1 = Arrays.binarySearch(nums, 0, r+1, target);
        int res2 = Arrays.binarySearch(nums, r+1, n , target);

        if (res1 < 0) return Math.max(-1,res2);
        if (res2 < 0) return Math.max(-1,res1);
        return -1;
    }
}
