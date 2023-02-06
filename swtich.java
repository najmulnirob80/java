import java.util.Scanner;

public class swtich {
    public static void main (String[]args){

Scanner input=new Scanner(System.in);


int digit;
System.out.print("Enter any number: ");
digit=input.nextInt();

switch(digit){
    case 0:
    System.out.println("zero");
    break;
    case 1:
    System.out.println("one");
    break;
    default:
    System.out.println("This number is not in the list");
}
    
}
}
