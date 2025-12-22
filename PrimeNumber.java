import java.util.Scanner;
public class PrimeNumber {    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=2;i<=number;i++){
            boolean isprime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime=false;
                }
            }
            if(isprime==true){
                System.out.print(i+" ");
            }
        }
    }
}
