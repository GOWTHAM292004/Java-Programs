import java.util.HashSet;
import java.util.Set;

public class LeetCode_217 {
    public static void main(String[] args) {
        LeetCode_217 obj=new LeetCode_217();
        int[] arr={1,2,3,1};
        System.out.println(obj.containsDuplicate(arr));
    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> a=new HashSet<>();
        for(int n:nums){
            a.add(n);
        }
        if(nums.length==a.size()){
            return false;
        }
        else{
            return true;
        }
    }   
}
