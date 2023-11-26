package learn;

public class ArrayOfObjects {

	public static void main(String[] args) {
		
		
		//ArrayOfObjectsFood[] freaze=new ArrayOfObjectsFood[3];
		
		
		
		
		ArrayOfObjectsFood food1=new ArrayOfObjectsFood("pizza");
		ArrayOfObjectsFood food2=new ArrayOfObjectsFood("pizza2");
		ArrayOfObjectsFood food3=new ArrayOfObjectsFood("pizza3");
		
		ArrayOfObjectsFood[] freaze= {food1,food2,food3};
		
		
		freaze[0]= food1;
		freaze[1]= food2;
		freaze[2]= food3;
		
		System.out.println(freaze[0].name);
		
		
		
	}

}
