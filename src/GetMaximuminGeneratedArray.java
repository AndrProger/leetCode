public class GetMaximuminGeneratedArray {
    public static int getMaximumGenerated(int n) {
        int[] nums=new int[n+1];
        if(n==0)
            return 0;
        nums[0] = 0;
        nums[1] = 1;

        for (int i=1;2*i<=n;i++){
            nums[2*i]=nums[i];
            if(2*i+1>n)
                break;
            nums[2 * i + 1] = nums[i] + nums[i + 1];
        }
        int max=Integer.MIN_VALUE;
        for (int i=0;i<=n;i++)
            max=Integer.max(max,nums[i]);
        return max;
    }
}
