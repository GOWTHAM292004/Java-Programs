import java.util.Scanner;
public class SumofDigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int sum=0;
        while(input>0){
            int digit=input%10;
            sum+=digit;
            input=input/10;
        }
        System.out.println(sum);
    }
}
