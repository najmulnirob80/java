import java.util.Scanner;
public class EvenOdd {
    public static void  main(String[]args){

Scanner getinput=new Scanner(System.in);

int in,r;
System.out.print("Enter any number: ");
in=getinput.nextInt();
r=in%2;

if (r==0){
System.out.println("even");
}
else{
    System.out.println("odd");
}


    }
}
