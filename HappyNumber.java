import java.util.Scanner;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();//input for happy and unhappy number
        int temp=input;//for verifing last
        while(input!=1 && input!=4){//stop when it is happy(1) and unhappy (4) every unhappy number will end in 4
            int sum=0;
            while(input>0){//fist take the last number of input square it and use += assignment operator in a variable and remover the number and do the same process unti the number become 0 but the squared number will be stored in the variable convert a=(that variable) . while loop will automatically repeate the process untill the number became 1 and 4
                int digit=input%10;
                sum+=digit*digit;
                input=input/10;
            }
            input=sum;
        }
        if(input==1){
            System.out.println(temp+" It is a happy Number");
        }
        else{
            System.out.println(temp+" It is Not a happy Number");
        }
    }
}
