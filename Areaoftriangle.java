import java.util.Scanner;


public class Areaoftriangle {
    public static void main(String[]args){

double a;
double half=0.5;

Scanner input= new Scanner(System.in);
double base;

System.out.print("Enter Base num: ");
base = input.nextDouble();


double hight;

System.out.print("Enter Hight Num: ");
hight=input.nextDouble();

a=half*base*hight;



System.out.print("This is the area : "+a);









    }
}
