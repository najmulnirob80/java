package learn;

public class overloadedconstructors {

	public static void main(String[] args) {
		
		
		overloadedconstructorsPizza pizza= new overloadedconstructorsPizza("man1","man2","man3");
		
		System.out.println("Here are the ingriendts of your pizza: ");
		
		System.out.println(pizza.one);
		System.out.println(pizza.two);
		System.out.println(pizza.three);
		System.out.println(pizza.four);
		
		

	}

}
