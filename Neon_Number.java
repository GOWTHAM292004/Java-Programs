import java.util.Scanner;
public class Neon_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int sum=0;
        while(input!=0){
            int digit=input%10;
            int sq=digit*digit;
            sum+=sq;
            input=input/10;
        }
        System.out.println(sum);
    }
}
