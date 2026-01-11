import java.util.*;
public class vowelsfinding_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char[] vowels= new char[a];
        for(int i=0;i<a;i++){
            vowels[i]=sc.next().charAt(0);
        }
        for(int i=0;i<a;i++){
            if(vowels[i]=='A' || vowels[i]=='E'||vowels[i]=='I' || vowels[i]=='O' || vowels[i]=='U' ||vowels[i]=='a' ||vowels[i]=='e' ||vowels[i]=='i'||vowels[i]=='o' ||vowels[i]=='u'){
                    System.out.println(i +" is a vowel");
            }
        }
    }
}
