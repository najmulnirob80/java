import java.util.Scanner;

public class circle {
    public static void main (String[]args){

Scanner input=new Scanner(System.in);

double a;
double pie=3.1416;

double radius;
System.out.print("Enter radius number: ");
radius=input.nextDouble();


a=pie*radius*radius;


System.out.print("This is the circle area : "+a);


    }
}
