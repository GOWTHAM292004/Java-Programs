import java.util.Scanner;
public class sunny_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int input_increment=input+1;
        for(int i=1;i<=input/2;i++){
            if(i*i==input){
                System.out.println("It is a Sunny Number");
            }
            else{
                System.out.println("It is a Not Sunny Number");
            }
        }
    }
}
