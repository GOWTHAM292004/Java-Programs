import java.util.Scanner;
public class Automorphic_Number
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int multi=input*input;
        int Last_Digit=multi%10;
        if(input==Last_Digit){
            System.out.println("It is a Automorphic Number");
        }
        else{
            System.out.println("It is not a Automorphic Number");
        }
    }
}
