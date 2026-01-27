import java.util.Scanner;
public class Automorphic_Number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Input : ");
        int input=sc.nextInt();
        int square=input*input;
        int input_size=String.valueOf(input).length();
        int mod=(int)Math.pow(10, input_size);
        if(square%mod==input){
            System.out.println("It is a Automorphic Number");
        }
        else{
            System.out.println("It is not a Automorphic Number");
        }
    }
}
