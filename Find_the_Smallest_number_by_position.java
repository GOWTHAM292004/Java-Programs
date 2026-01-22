import java.util.Arrays;
import java.util.Scanner;

public class Find_the_Smallest_number_by_position {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int array_size=sc.nextInt();
        int[] arr=new int[array_size];
        for (int i=0;i<array_size;i++){
            System.out.print("Enter the Element : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter n th Smallest index to find : ");
        int Position=sc.nextInt();
        if(Position<=array_size){
            Arrays.sort(arr);
            System.out.print("The "+Position+" Smallest Number is : ");
            System.out.println(arr[Position-1]);
        }
        else{
            System.out.print("Enter the valid Position");
        }
    }

}
