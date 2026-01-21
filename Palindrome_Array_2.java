import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_Array_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int input=sc.nextInt();
        String[] arr=new String[input];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }
        String[] result=new String[arr.length];
        int a=0;
        for(int i=result.length-1;i>=0;i--){
            result[a]=arr[i];
            a++;
        }
        if(Arrays.toString(arr).equals(Arrays.toString(result))){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is Not a palindrome");
        } 
    }
}
