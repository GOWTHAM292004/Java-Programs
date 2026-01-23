import java.util.Scanner;
public class Count_oddeven_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Size of the array : ");
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the Element : ");
            arr[i]=sc.nextInt();
        }
        int odd=0;
        int even=0;
        for(int i=0;i<=arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }

    }
}
