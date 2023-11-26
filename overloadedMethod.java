package learn;

public class overloadedMethod {

	public static void main(String[] args) {
		
		int x=sum(1,2,3);
		
		System.out.println(x);

	}
	
	static int sum(int a, int b) {
		System.out.println("This is overloaded 1");
		return a+b;
	}
	
	static int sum(int a, int b, int c) {
		System.out.println("This is overloaded 2");
		return a+b+c;
	}

	static int sum(int a, int b, int c, int d) {
		System.out.println("This is overloaded 3");
		return a+b+c+d;
}

}
