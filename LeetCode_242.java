import java.util.Arrays;
public class LeetCode_242 {
    public static void main(String[] args) {
        LeetCode_242 obj=new LeetCode_242();
        System.out.println(obj.isAnagram("anagram", "nagaram"));
    }
    public boolean isAnagram(String s, String t) {
        boolean result=true;
        if(s.length()!=t.length()){
            result= false;
            return result;
        }
        char[] arr1=new char[s.length()];
        char[] arr2=new char[t.length()];
        for(int i=0;i<s.length();i++){
            arr1[i]=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            arr2[i]=t.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String a=Arrays.toString(arr1);
        String b=Arrays.toString(arr2);
        if(a.equals(b)){
            result=true;
            return result;
        }
        else{
            result=false;
            return result;
        }
}
}
