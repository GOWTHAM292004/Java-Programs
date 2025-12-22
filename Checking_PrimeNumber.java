import java.util.Scanner;
public class Checking_PrimeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime==true){
            System.out.println("it is a prime number");
        }
        else{
            System.out.println("it is not a prime number");
        }
    }
}
