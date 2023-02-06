import java.util.Scanner;

/*
 * Assigment 18 (Print the day name)
 * declare an array of weekdays 
 * User will give a day number you have to print the equivalent day name
 * 
 * Example 1
 * input-> Enter day number (1-7) : 1
 * output-> Monday
 * 
 * Example 2
 * input-> Enter day number (1-7) : 3
 * output-> Wednesday
 */

public class Assignment18 {
  public static void main(String[] args) {

       try (Scanner input = new Scanner(System.in)) {
       
         String  [] datename= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};


  String a;
    System.out.print("Enter any date: ");
    a=input.nextLine();

if(a.equals("1")){
  System.out.println(datename[0]);
}

else if(a.equals("2")){
  System.out.println(datename[1]);
}
else if(a.equals("3")){
  System.out.println(datename[2]);
}
else if(a.equals("4")){
  System.out.println(datename[3]);
}
else if(a.equals("5")){
  System.out.println(datename[4]);
}
else if(a.equals("6")){
  System.out.println(datename[5]);
}
else if(a.equals("7")){
  System.out.println(datename[6]);
}
else{
  System.out.println("Thats not in a list");
}

}


       





      }
  }
