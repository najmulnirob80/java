import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] number = new int[5];

        System.out.print("Enter Numbers for sum: ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }


        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }

int minimum=number[0];
int maximum=number[0];

        for (int i = 0; i < number.length; i++){
            if(minimum>number[i]){
                minimum=number[i];
            }
        }
        for (int i = 0; i < number.length; i++){
            if(maximum<number[i]){
                maximum=number[i];
            }
        }

        double avg = sum / number.length;
        System.out.println("The minimum is :"+minimum);
        System.out.println("The maximum is: "+maximum);
        System.out.println("The sum is: " + sum);
        System.out.println("The array size is: " + number.length);
        System.out.println("The avarage is: " + avg);
    }

}
