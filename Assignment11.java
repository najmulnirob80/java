    // find factorial of n
import java.util.Scanner;    
    public class Assignment11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
     

int a;
System.out.print("Enter any number: ");

a=input.nextInt();

        for(int i=4;i>=1;i--){
a=i*a;
        }
        System.out.println(a);
    }
}
