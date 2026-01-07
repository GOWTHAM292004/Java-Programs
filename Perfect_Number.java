import java.util.Scanner;
public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int sum=0;
        for(int i=1;i<input;i++){
            if(i%input==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        if(sum==input){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a Perfect number");
        }
    }
}
