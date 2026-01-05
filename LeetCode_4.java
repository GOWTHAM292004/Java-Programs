import java.util.Arrays;

public class LeetCode_4 {
    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        Solution obj=new Solution();
        System.out.println(obj.findMedianSortedArrays(nums1,nums2));
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c=new int[nums1.length + nums2.length];
        int midvalue;
        int result;
        int a=0;
        int b=0;
        for(int i=0;i<nums1.length;i++){
            c[i]=nums1[i];
            a++;
        }
        for(int j=0;j<nums2.length;j++){
            c[a]=nums2[b];
            a++;
            b++;
        }
        int d=c.length;
        if(d%2==1){
            Arrays.sort(c);
            midvalue=c.length/2;
            double dbl=c[midvalue];
            return dbl;
        }
        else{
            Arrays.sort(c);
            midvalue=(c.length/2)-1;
            int midvalue2=midvalue+1;
            double finalmidvalue=(c[midvalue]+c[midvalue2])/2.0;
            return finalmidvalue;
        }
    }
}
