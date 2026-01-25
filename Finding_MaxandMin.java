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
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();
        System.out.print("The maximum Number is : ");
        System.out.println(max);
        System.out.print("The minimum Number is : ");
        System.out.println(min);

    }
}
