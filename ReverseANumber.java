import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
int a,temp,b,sum=0;

    System.out.println("Enter any numbers: ");
        a=input.nextInt();

        temp=a;

        while(temp!=0){
        b=temp%10;
        sum=sum*10+b;
        temp=temp/10;
        }

System.out.println(sum);
    


    }
}
