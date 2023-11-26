package learn;

public class wrapperclass {
public static void main(String[]args) {


	Boolean a=true;
	Character b='a';
	Integer c= 123;
	Double d=3.343;
	String e="bro";


	//premitive to object
	double g=12.2;
	Double f=Double.valueOf(g);
	System.out.println(g);



	//object to premitive
	Double x=12.2;
	double z=x.doubleValue();
	System.out.println(z);


}
	
}
