package MaximumSubarray;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int sumArr=0;
        int nextSum=0;
        int trySum=0;
        int i=0;
        boolean creatArr=false;
        boolean canTryCreatArr=false;

        //
        int max=-10000;
        while( i<nums.length&&nums[i]<=0)
        {
            if (nums[i]>max)
                max=nums[i];
            i++;
        }

        if(i==nums.length){
            return max;
        }
        sumArr=nums[i++];
        for (;i<nums.length;i++){

            if(canTryCreatArr) {
                trySum += nums[i];
                if (trySum <= 0){
                    trySum=0;
                    continue;
                }
                if(trySum>=sumArr) {
                    sumArr=trySum;
                    nextSum=0;
                    creatArr=false;
                    canTryCreatArr=false;
                    trySum=0;
                }
            }
            else {
                if(nums[i]<=0){
                    nextSum+=nums[i];

                    if (nextSum+sumArr<=0){
                        if(i+1< nums.length&&nums[i+1]>0)
                            canTryCreatArr=true;
                    }

                }
                else {
                    nextSum+=nums[i];
                    if (nextSum>0){
                        sumArr+=nextSum;
                        nextSum=0;
                    }
                }
            }

        }
        return sumArr;
    }
    public int lmaxSubArray(int[] nums) {
        int sum=0;
        int MaxSum = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++)
        {
            if (sum<=0)
            {
                sum=nums[i];
            }
            else
            {
                sum+=nums[i];
            }
            if (sum>MaxSum)
                MaxSum=sum;
        }

        return MaxSum;
    }
}
