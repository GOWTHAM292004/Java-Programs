import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int length=0;
        for(int i=0;i<a;i++){
            length++;
        }
        while(a!=0){
            int sum1=1;
            int digit=a%10;
            for(int i=0;i<length;i++){
                sum1*=digit;
            }
            sum=sum*10+sum1;
            a=a/10;
        }
        System.out.println(sum);
    }
}
