import java.util.Scanner;

public class Armstrongnumber {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    
int n,temp,sum,r;


System.out.print("Enter the number: ");
n=input.nextInt();


temp=n;
sum=0;


while(temp!=0){
r=temp%10;
sum=sum+r*r*r;
temp=temp/10;

}

if(sum==n){
    System.out.println("This is a Armstrong number");
}
else{
 System.out.println("This is not a Armstrong number");
}


   } 
}
