import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);

        System.out.print("Enter col number: ");
        int a=input.nextInt();

        for(int row=1; row<=a; row++){
            for(int col=1;col<=row; col++){
                System.out.print(" "+col);
            }
            System.out.println("");
        }
    }
}
