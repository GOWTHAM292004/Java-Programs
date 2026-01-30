public class LeetCode_70 {
    public static void main(String[] args) {
        LeetCode_70 obj =new LeetCode_70();
        System.out.println(obj.climbStairs(3));
    }
    public int climbStairs(int n) {
        int a=1;
        int b=1;
        for (int i=0;i<n;i++){
            int temp=0;
            temp=a+b;
            a=b;
            b=temp;
        }
        return a;
    }
}
