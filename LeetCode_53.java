public class LeetCode_53 {
    public static void main(String[] args) {
        LeetCode_53 obj=new LeetCode_53();
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(obj.maxSubArray(nums));
    }
     public int maxSubArray(int[] nums) {
        int current_sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            current_sum+=nums[i];
            if(current_sum<nums[i]){
                current_sum=nums[i];
            }
            if(current_sum>max){
                max=current_sum;
            }
        }
        return max;
    }
}
