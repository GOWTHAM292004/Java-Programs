import java.util.*;
public class LeetCode_2154 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution obj=new Solution();
        int[] a=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter the array Number : ");
            a[i]=sc.nextInt();
        }
        int original=sc.nextInt(); 
        obj.findFinalValue(a,original);
    }
}
class Solution {
    public int findFinalValue(int[] nums, int original) {
      ArrayList<Integer> a=new ArrayList<>();
      for (int num:nums){
        a.add(num);
      }
      while(a.contains(original)){
        original=original*2;
      }
      return original;
    }
}