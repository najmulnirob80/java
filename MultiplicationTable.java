import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        

int a,b=1;
System.out.print("Enter any number: ");
a=input.nextInt();

        for(int i=1; i<=10;i++){
System.out.print(a+"x"+i);
b=i*a;
System.out.print("= "+b);
System.out.println("");

        }

    }
}
