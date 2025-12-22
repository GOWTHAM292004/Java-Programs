import java.util.Scanner;
public class Primenumbers {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int last=sc.nextInt();
        for(int i=first;i<=last;i++){
            boolean isprime=true;
            if(i<=1){
                isprime=false;
            }
            else{
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        isprime=false;
                        break;
                    }
                }
            }
            if(isprime==true){
                System.out.print(i+" ");
            }
        }
    }
}
