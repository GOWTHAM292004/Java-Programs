import java.util.Arrays;
import java.util.Scanner;
public class Find_Largest_Number_By_Position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int array_size=sc.nextInt();
        int[] arr=new int[array_size];
        for (int i=0;i<array_size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Which Largest number to find : ");
        int Position=sc.nextInt();
        if(Position<array_size){
            Arrays.sort(arr);
            System.out.println(arr[Position]);
        }
        else{
            System.out.print("Enter the valid Position");
        }
    }
}
