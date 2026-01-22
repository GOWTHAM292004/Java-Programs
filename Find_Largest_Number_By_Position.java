import java.util.Arrays;
import java.util.Scanner;
public class Find_Largest_Number_By_Position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int array_size=sc.nextInt();
        int[] arr=new int[array_size];
        for (int i=0;i<array_size;i++){
            System.out.print("Enter the Element : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter n th Largest index to find : ");
        int Position=sc.nextInt();
        if(Position<=array_size){
            Arrays.sort(arr);
            int[] arr2=new int[arr.length];
            int a=0;
            for(int i=arr.length-1;i>=0;i--){
                arr2[a]=arr[i];
                a++;
            }
            System.out.print("The "+Position+" Largest Number is : ");
            System.out.println(arr2[Position-1]);
        }
        else{
            System.out.print("Enter the valid Position");
        }
    }
}
