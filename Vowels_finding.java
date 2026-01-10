import java.util.Scanner;
public class Vowels_finding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char input=sc.next().charAt(0);
        Solution obj=new Solution();
        obj.vowels(input);
    }
}

class Solution{
    public void vowels(char input){
        if(input=='A' || input=='E'||input=='I' || input=='O' || input=='U' ||input=='a' ||input=='e' ||input=='i'||input=='o' ||input=='u'){
            System.out.println(input+" It is a vowel");
        }
        else{
            System.out.println(input+" It is Not a vowel");
        }
    }
}
