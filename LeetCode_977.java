import java.util.Arrays;

public class LeetCode_977 {
    public static void main(String[] args) {
        LeetCode_977 obj=new LeetCode_977();
        int[] nums={-4,-1,0,3,10};
        System.out.println(obj.sortedSquares(nums));
    }
     public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=nums[i]*nums[i];
        }
        Arrays.sort(result);
        return result;
    }
}
