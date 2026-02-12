import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode_35 {
    public static void main(String[] args) {
        LeetCode_35 obj=new LeetCode_35();
        int[] arr={2,5,4,8,5,0};
        System.out.println(obj.searchInsert(arr, 5));
    }
    public int searchInsert(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        int[] new_nums=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            new_nums[i]=nums[i];
        }
        new_nums[new_nums.length-1]=target;
        Arrays.sort(new_nums);
        for (int i=0;i<new_nums.length;i++){
            if(new_nums[i]==target){
                return i;
            }
        }
        return 0;
    }
}
