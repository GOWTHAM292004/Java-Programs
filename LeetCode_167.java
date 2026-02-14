public class LeetCode_167 {
    public static void main(String[] args) {
        LeetCode_167 obj =new LeetCode_167();
        int[] numbers={1,2,3,4,5};
        int target=7;
        System.out.println(obj.twoSum(numbers, target));
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }
            }
        }
        return result;
    }
}
