// find nth fibonacci number
import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
int n,first,second,fibo;
System.out.print("which fibonacci number you want to see?: ");
n=input.nextInt();

first=0;
second=1;


for (int i=3; i<=1000000000;i++){

fibo=first+second;
first=second;
second=fibo;

if(n==i){
System.out.print(fibo);
break;
        }

    }



    }
}


