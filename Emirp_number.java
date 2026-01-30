import java.util.Scanner;
public class Emirp_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the input : ");
        int input =sc.nextInt();
        int temp=input;
        boolean isprime=true;
        for(int i=2;i<temp/2;i++){
            if(input%i==0){
                isprime=false;
            }
        }
        int reverse=0;
        boolean rev_isprime=true;
        if(isprime==true){
            while(temp>0){
                int digit =temp%10;
                reverse=reverse*10+digit;
                temp=temp/10;
            }
            for(int i=2;i<reverse/2;i++){
                if(reverse%i==0){
                    rev_isprime=false;
                }
            }
            if(isprime==true && rev_isprime==true){
                System.out.println("It is a Emirp Number");
            }
        }
        else{
            System.out.println("It is not a Emirp Number");
        }
        
    }
}
