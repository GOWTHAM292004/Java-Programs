import java.util.Scanner;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int length=0;
        while(temp>0){
            length++;
            temp=temp/10;
        }
        do{
            int sum=0;
            for(int i=0;i<length;i++){
                int digit=a%10;
                sum+=digit*digit;
                a=a/10;
            }
            a=sum;
        }while(a!=1);
    }
}
