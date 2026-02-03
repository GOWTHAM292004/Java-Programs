public class Leetcode_125 {
    public static void main(String[] args) {
        Leetcode_125 obj =new Leetcode_125();
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
    }
        public boolean isPalindrome(String s) {
        String modified_s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String result="";
        for(int i=modified_s.length()-1;i>=0;i--){
            char a=modified_s.charAt(i);
            result+=a;
        }
        if(modified_s.equals(result)){
            return true;
        }
        else{
            return false;
        }
    }

}
