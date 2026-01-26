import java.lang.reflect.Array;
import java.util.*;
public class Finding_MaxandMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int a=sc.nextInt();
        int [] arr=new int[a];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the Element "+i+": ");
            arr[i]=sc.nextInt();
        }
        //Built-in method with stream in Arrays.
        // int max=Arrays.stream(arr).max().getAsInt();
        // int min=Arrays.stream(arr).min().getAsInt();
        // System.out.print("The maximum Number is : ");
        // System.out.println(max);
        // System.out.print("The minimum Number is : ");
        // System.out.println(min);

        // manual method
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        
        System.out.print("The maximum Number is : ");
        System.out.println(max);
        System.out.print("The minimum Number is : ");
        System.out.println(min);
    }
}
