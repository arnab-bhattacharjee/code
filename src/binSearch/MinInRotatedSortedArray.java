package binSearch;

public class MinInRotatedSortedArray {

    public int findMin(int[] nums) {
        int n = nums.length;

        int hi = n-1;
        int lo = 0;

        while (lo < hi) {
            int mid = lo + ((hi-lo)>>1);
            if (nums[lo] < nums[mid] && nums[mid] > nums[hi]) {
                lo = mid+1;
            } else if (nums[lo] > nums[mid]) {
                hi = mid;
            } else if (nums[lo] < nums[mid] && nums[mid] < nums[hi]) {
                return nums[lo];
            } else {
                return Math.min(nums[lo], nums[hi]);
            }
        }
        return -1;
    }

}
