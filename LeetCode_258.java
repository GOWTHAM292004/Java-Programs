public class LeetCode_258 {
    public static void main(String[] args) {
        LeetCode_258 obj=new LeetCode_258();
        System.out.println(obj.addDigits(38));
    }
    public int addDigits(int num) {
        while(num!=0){
            int result=0;
            String a=String.valueOf(num);
            for(int i=0;i<a.length();i++){
                int digit=num%10;
                result+=digit;
                num=num/10;
            }
            if(result<=9){
                return result;
            }
            else{
                num=result;
            }

        }
        return num;
    }
}
