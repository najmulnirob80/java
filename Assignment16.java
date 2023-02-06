// validate user based on username and password
// input username and password until username=="anis" and password=="123456"
// if username and password does not match print "username/password is incorrect. Please try again"
// if username and password match print "welcome to the system"

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
String a,b;
String username="anis";
String password="123456";

        for(int i=1;i<=1000000000;i++){
            System.out.print("Enter username: ");
            a=input.nextLine();
            System.out.print("Enter password for "+a+": ");
            b=input.nextLine();

            if(a.equals(username) && b.equals(password)){
System.out.println("Welcome to the system");
           break;
         }
            else{
                System.out.println("Username/Password is incorrect. Please try again");
            }

        }





    }
}
