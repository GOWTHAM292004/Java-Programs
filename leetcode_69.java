public class leetcode_69 {
    public static void main(String[] args) {
        leetcode_69 obj=new leetcode_69();
        System.out.println(obj.mySqrt(7));
    }
     public int mySqrt(int x) {
        int left=1;
        int right=x;
        int ans=0;
        if(x==0){
            return 0;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if((long)mid*mid==x){
                return mid;
            }
            else if((long)mid*mid>x){
                right=mid-1;
            }
            else if((long)mid*mid<x){
                ans=mid;
                left=mid+1;
            }
        }
        return ans;
    }
}
