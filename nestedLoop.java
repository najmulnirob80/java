import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        

int a,b;
System.out.print("Enter First number: ");
a=input.nextInt();
System.out.print("Enter last number: ");
b=input.nextInt();


for(int i=a;i<=b;i++){

    for(int j=1; j<=10;j++){
      System.out.println(i+"x"+j+"="+ i*j);
                }
                System.out.println();

}



 
    }
}
