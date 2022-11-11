public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxTillNow = nums[0], minTillNow = nums[0], max = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                int temp = maxTillNow;
                maxTillNow = minTillNow;
                minTillNow = temp;
            }

            maxTillNow = Math.max(nums[i], nums[i] * maxTillNow);
            minTillNow = Math.min(nums[i], nums[i] * minTillNow);

            max = Math.max(max, maxTillNow);
        }

        return max;
    }
}
