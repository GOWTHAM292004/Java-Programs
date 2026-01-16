import java.util.Scanner;

public class Sum_naturalnumbers2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int input=sc.nextInt();
        int sum=0;
        int a=1;
        while(a!=input+1){
            sum+=a;
            a++;
        }
        System.out.print("The sum of n Natural number is : ");
        System.out.println(sum);
    }
}
