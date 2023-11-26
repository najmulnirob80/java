package learn;

public class printf {

	public static void main(String[] args) {
		
	

		boolean myboolean=true;
		char mychar='a';
		String name="hello";
		int myint=32;
		double mydouble=2.444455;
		
		
		System.out.printf("%b",myboolean);
		System.out.printf("%c",mychar);
		System.out.printf("%s",name);
		System.out.printf("%d",myint);
		System.out.printf("%f",mydouble);
		
		System.out.println("");
		
		//width
		System.out.printf("String= %-10s",name);
		
		//precision
		System.out.printf("This is doubole %.2f",mydouble);
		
		
		
	}

}
