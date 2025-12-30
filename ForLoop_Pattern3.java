import java.util.Scanner;
public class ForLoop_Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row =sc.nextInt();
        int col=sc.nextInt();
        char ch='A';
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||i<row-1||j==0||j<col-1){
                    System.out.print(ch);
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
