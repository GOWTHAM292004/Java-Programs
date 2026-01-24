import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class RemoveDuplicate_charecter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array : ");
        int size=sc.nextInt();
        char[] arr=new char[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the Element : ");
            arr[i]=sc.next().charAt(0);
        }
        Set<Character> set=new HashSet<>();
        for(char a: arr){
            set.add(a);
        }

        char[] result=new char[set.size()];
        int temp=0;
        for(char a: set){
            result[temp]=a;
            temp++;
        };
        System.out.println(Arrays.toString(result));
    }
}
