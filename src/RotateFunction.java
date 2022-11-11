public class RotateFunction {
    public static int maxRotateFunction(int[] nums) {
        int max=Integer.MIN_VALUE;
        int f=0;
        int startIndex=0;
        for (int i=0;i<nums.length;i++){
            int index=startIndex;
            for (int j=0;j<nums.length;j++){
                if(index== nums.length)
                    index=0;
                f+=j*nums[index++];
            }
            max=Integer.max(max,f);
            f=0;
            startIndex++;

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxRotateFunction(new int[]{4,3,2,6}));

    }
}
