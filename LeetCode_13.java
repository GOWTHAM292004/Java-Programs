public class LeetCode_13{
    public int romanToInt(String s) {
        LeetCode_13 obj=new LeetCode_13();
        int result=0;
        for(int i=0;i<s.length();i++){
            int a=obj.value(s.charAt(i));
            if(i+1<s.length() && obj.value(s.charAt(i))<obj.value(s.charAt(i+1))){
                result-=a;
            }
            else{
                result+=a;
            }
        }
        return result;
    }
    public int value(char a){
        switch (a){
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }
    }
}