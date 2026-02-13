public class LeetCode_367 {
    public static void main(String[] args) {
        LeetCode_367 obj=new LeetCode_367();
        System.out.println(obj.isPerfectSquare(9));
    }
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int left=1;
        int right=num/2;
        while(left<=right){
            int mid=left+(right-left)/2; // We can also use (left+right)/2 also to find mid use both and check which is working perfectely.
            long sq=(long)mid*mid;
            if(sq==num){
                return true;
            }
            else if(sq<num){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}
