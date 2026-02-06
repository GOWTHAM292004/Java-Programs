public class LeetCode_121 {
    public static void main(String[] args) {
        LeetCode_121 obj =new LeetCode_121();
        int[] prices={7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int buying=Integer.MAX_VALUE;
        int selling=0;
        for(int i=0;i<prices.length;i++){
            if(buying>prices[i]){
                buying=prices[i];
            }
            else{
                int profit=prices[i]-buying;
                if(profit>selling){
                    selling=profit;
                }
            }
        }
        return selling;
    }
}
