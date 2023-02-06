import java.util.Scanner;

public class sumofdigits {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    
int n,temp,sum,r;


System.out.print("Enter the number: ");
n=input.nextInt();


temp=n;
sum=0;


while(temp!=0){
r=temp%10;
sum=sum+r;
temp=temp/10;

}

System.out.println(sum);


   } 
}
