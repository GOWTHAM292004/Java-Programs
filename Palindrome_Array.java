import java.util.Arrays;
import java.util.Scanner;
public class Palindrome_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int input=sc.nextInt();
        int[] arr=new int[input];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] result=new int[arr.length];
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
