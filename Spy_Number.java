import java.util.Scanner;
public class Spy_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int temp=input;
        int sum=0;
        int multi=1;
        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            multi*=digit;
            temp=temp/10;
        }
        if(sum==multi){
            System.out.println("It is a Spy Number");
        }
        else{
            System.out.println("It is Not a Spy Number");
        }
    }
}
