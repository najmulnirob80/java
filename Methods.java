package learn;

public class Methods {

	public static void main(String[] args) {
		
		String name="Hi";
		int age=22;
		
		int x=30;
		int y=20;
		
		//return sum method
		
		int a=sum(x,y);
		
	 System.out.println(a);
		
		//hello method run
Hello(name,age);

	}
	
	static void Hello(String a,int b) {
		
		
		System.out.println("Hello "+a+" "+b);
		
		
	}
	static int sum(int a, int b) {
	
		int z=a+b;
		
		return z;
		
	}

}
