import java.util.Scanner;
public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        String input=sc.nextLine();
        int result=Integer.parseInt(input,2);
        System.out.println(result);
    }
}
