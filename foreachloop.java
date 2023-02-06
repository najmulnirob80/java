public class foreachloop {
    public static void main(String[] args) {
        int[] num={10,40,30,20,40};
int sum=0;

for(int x: num){
    sum=sum+x;
}
System.out.print("The sum is "+sum);

    }
}
