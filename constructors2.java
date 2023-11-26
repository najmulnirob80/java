package learn;

public class constructors2 {

	String name;
	int age;
	double wallet;
	
	
	constructors2(String name, int age, double wallet){

		this.name=name;
		this.age=age;
		this.wallet=wallet;
		
	}
	
	void eat() {
		System.out.println(this.name+" is eating");
		
	}
	
	void drink() {
		
		System.out.println(this.name+" is drinking");
	}
	
	
}
