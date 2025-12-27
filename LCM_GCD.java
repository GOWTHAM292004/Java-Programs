import java.util.Scanner;
public class LCM_GCD {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a%b!=0){
            int digit=a%b;
            a=b;
            b=digit;
        }
        System.out.println(b);
    }
}
