package learn;

import java.util.ArrayList;

public class eachloop {
public static void main(String[]args) {
	
	
	ArrayList<String> animals=new ArrayList();
	
	animals.add("dog");
	animals.add("cat");
	animals.add("shark");
	
	
	for(String x : animals) {
		
		System.out.println(x);
		
		
	}
	
	
	
	
}
}
