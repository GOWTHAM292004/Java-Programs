public class LeetCode_1480 {
    public static void main(String[] args) {
        LeetCode_1480 obj=new LeetCode_1480();
        int[] nums={1,2,3,4};
        System.out.println(obj.runningSum(nums));
    }
    public int[] runningSum(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=0;j<=i;j++){
                temp+=nums[j];
            }
            result[i]=temp;
        }
        return result;
    }
}
