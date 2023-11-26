public class Array0to19 {
    public static void main(String[] args)  {

            int [][] a=new int[4][5];
            int k=0;

            for(int row=0; row<4 ; row++){
                for (int col=0; col<5; col++){

                    a[row][col]=k;
                    k++;
                    System.out.print(" "+a[row][col]);

                }
            System.out.println("");
        }



    }

}
