import java.util.Arrays;
import java.util.Scanner;
public class Check_Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String input=sc.nextLine();
        System.out.print("Enter the size of the array : ");
        int size_of_arr=sc.nextInt();
        char[] arr=new char[size_of_arr];
        for(int i=0;i<input.length();i++){
            arr[i]=input.charAt(i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
