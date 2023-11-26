package learn;

public class overloadedconstructorsPizza {

	
	String one;
	String two;
	String three;
	String four;
	
	
	
	overloadedconstructorsPizza(String o, String t, String th, String f){
		
		this.one = o;
		this.two = t;
		this.three = th;
		this.four= f;
		
		
	}


overloadedconstructorsPizza(String o, String t, String th){
		
		this.one = o;
		this.two = t;
		this.three = th;
	
		
		
	}
	


overloadedconstructorsPizza(String o, String t){
	
	this.one = o;
	this.two = t;
	
	
	
}
	
}
