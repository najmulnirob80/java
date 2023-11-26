package learn;

public class constructors {

	public static void main(String[] args) {
	
		
		constructors2 testv=new constructors2("name",22,554.54);
		
		constructors2 testv2=new constructors2("name2",23,55.43);
		
		
		System.out.println(testv.name);
		System.out.println(testv2.name);

		
		testv.drink();
		testv2.drink();
		
		
		
		
	}

}
