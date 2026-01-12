import java.util.Scanner;
public class String_vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        for(int i=0;i<input.length();i++){
            char a=input.charAt(i);
            if(a=='A' || a=='E'||a=='I' || a=='O' || a=='U' ||a=='a' ||a=='e' ||a=='i'||a=='o' ||a=='u'){
                System.out.println(a+" is a vowel");
            }
        }
    }
}
