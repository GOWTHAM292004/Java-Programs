import java.util.Arrays;

public class LeetCode_268 {
    public static void main(String[] args) {
        LeetCode_268 obj =new LeetCode_268();
        int[] arr={3,0,1};
        System.out.println(obj.missingNumber(arr));
    }
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i; 
            }
        }
        return nums[nums.length-1]+1;
    }
}
