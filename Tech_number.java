import java.util.Scanner ;
public class Tech_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Input : ");
        int input=sc.nextInt();
        String original=String.valueOf(input);
        int half=original.length()/2;
        String first_half=original.substring(0, half);
        String second_half=original.substring(half);
        int a=Integer.parseInt(first_half);
        int b=Integer.parseInt(second_half);
        int add=a+b;
        int result=add*add;
        if(result==input){
            System.out.println("It is a Tech number");
        }
        else{
            System.out.println("It is Not a Tech number");
        }
    }
}
