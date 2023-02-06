import java.util.Scanner;
public class Logicaloperator {
    public static void main(String[]args){

Scanner input2= new Scanner(System.in);

char input;


System.out.print("Enter any latter to check vowel or consonat:  ");
input=input2.next().charAt(0);



if(input=='a' || input=='e' || input=='i' || input=='o' || input=='u' ){

System.out.println("vowel");
}

else if(input=='A' || input=='E' || input=='I' || input=='O' || input=='U' ){

    System.out.println("vowel");
    }

else{
    System.out.println("consonant");
}


    }}