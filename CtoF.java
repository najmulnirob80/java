import java.util.Scanner;

public class CtoF {
    public static void main (String[]args){

Scanner input= new Scanner(System.in);

double a95=1.8,cel,last=32,far;



System.out.print("Enter the Celsius number: ");
cel=input.nextDouble();

far=a95*cel+last;

System.out.print("This is fahrenheit: "+far);



    }
}
