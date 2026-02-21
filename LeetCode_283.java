public class LeetCode_283 {
    public static void main(String[] args) {
        LeetCode_283 obj =new LeetCode_283();
        int [] nums={0,1,3,0,7,0,4,0,22,0};
        obj.moveZeroes(nums);
    }
    public void moveZeroes(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[temp]=nums[i];
                temp++;
            }
        }
        while(temp<nums.length){
            nums[temp]=0;
            temp++;
        }
    }
}
