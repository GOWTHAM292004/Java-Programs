import java.util.Scanner;
public class Duck_Number{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Input : ");
        int input=sc.nextInt();
        Duck_Number obj=new Duck_Number();
        obj.duck_number(input);
    }
    public String duck_number(int input){
        String a=String.valueOf(input);
        if(a.charAt(0)=='0'){
            return "It is Not a Duck Number";
        }
        else{
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)=='0'){
                    return "It is a Duck Number";
                }
            }
            return "It is Not a Duck Number";
        }
    }
}
