import java.util.Scanner;

public class ArrayMatrix1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][] a=new int[2][3];
        int [][] b=new int[2][3];
        
        //getting input for a matrix

        for(int row=0; row<2 ; row++){
            for (int col=0; col<3; col++){
                System.out.printf("A[%d][%d] =",row,col);
                a[row][col]=input.nextInt();
            }
        }

        //getting input for b matrix

        for(int row=0; row<2 ; row++){
            for (int col=0; col<3; col++){
                System.out.printf("B[%d][%d] =",row,col);
                b[row][col]=input.nextInt();
            }
        }


        //printing a matrix
        System.out.println("A =");
        for(int row=0; row<2 ; row++){
            for (int col=0; col<3; col++){
                System.out.print(" "+a[row][col]);
            }
            System.out.println("");
        }

        //printing b matrix
        System.out.println("B =");
        for(int row=0; row<2 ; row++){
            for (int col=0; col<3; col++){
                System.out.print(" "+b[row][col]);
            }
            System.out.println("");
        }

    }
}
