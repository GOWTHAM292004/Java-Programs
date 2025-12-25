import java.util.Arrays;
import java.util.Scanner;
public class LeetCode_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[1]=i;
                    arr[0]=j;
                }
            }
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        LeetCode_1 obj=new LeetCode_1();
        int[] arr1=new int[5];
        for(int i=0;i<arr1.length;i++){
            System.out.print("Enter the number : ");
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the Target : ");
        int target=sc.nextInt();
        System.out.println(Arrays.toString(obj.twoSum(arr1, target)));
    }
}
