public class BreakAndContinue {
    public static void main(String[]args){

        
        for (int i=1;i<=100;i++){
            if(i==10){
                break;
            }
            System.out.println(i+" bangladesh");
            }

            for (int i=11;i<=100;i++){
                if(i==20){
                    continue;
                }
                System.out.println(i+" bangladesh");
                }
    }
}
