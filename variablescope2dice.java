package learn;

import java.util.Random;


public class variablescope2dice {
	
	
	Random random= new Random();
	int number = 0;
	
	
	variablescope2dice(){
		
		
		variablescope3roller();
		
	}
	
	void variablescope3roller() {
		
		number=random.nextInt(6)+1;
		
		System.out.println(number);
		
		
	}
	

}
