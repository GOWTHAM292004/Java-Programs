public class LeetCode_724 {
    public static void main(String[] args) {
        LeetCode_724 obj=new LeetCode_724();
        int[] nums ={1,7,3,6,5,6};
        System.out.println(obj.pivotIndex(nums));
    }
    public int pivotIndex(int[] nums) {
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            right+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            right-=nums[i];
            if(right==left){
                return i;
            }
            else{
                left+=nums[i];
            }
        }
        return -1;
    }
}
