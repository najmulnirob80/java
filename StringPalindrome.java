package learn;

public class StringPalindrome {
    public static void main(String[] args) {


        String s1="madambb";

        StringBuffer sb=new StringBuffer(s1);

        sb.reverse();

        String s2=sb.reverse().toString();

        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }


    }
}
