package learn;

public class JavaObjects {

	public static void main(String[] args) {
		
		JavaObjects2Cars mycar= new JavaObjects2Cars();
		
		JavaObjects2Cars mycar2= new JavaObjects2Cars();
		
		
		System.out.println(mycar.model);
		System.out.println(mycar.make);
		mycar.drive();
		mycar.brake();
		

		System.out.println(mycar2.model);
		System.out.println(mycar2.make);
		
	}

}
