import java.util.Scanner;

public class Assignment14{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
int a,temp,b,sum=0,c,d,hmp=0,i;

    System.out.print("Enter first numbers: ");
        c=input.nextInt();
     System.out.print("Enter second number: ");
        d=input.nextInt();

        


      
for(i=c; i<=d;i++){
    temp=i;
        while(temp!=0){
        b=temp%10;
        sum=sum*10+b;
        temp=temp/10;
        }


    
if(i==sum){
    System.out.print(i+" ");
hmp++;
}  
sum=0;  }
System.out.println("");
System.out.println("Palindrome numbers are"+hmp);
    
    }
}