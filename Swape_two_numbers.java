import java.util.Scanner;
public class Swape_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swaping the Numbers");
        System.out.println(a);
        System.out.println(b);
    }
}
