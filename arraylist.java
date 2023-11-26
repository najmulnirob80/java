package learn;


import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> food= new ArrayList<String>();
		
		food.add("hi");
		food.add("hi2");
		food.add("hi3");

		//replace
		food.set(0, "hir");
		//remote
		food.remove(2);
		//clear
		//food.clear();
		for(int i=0;i<food.size();i++) {
		
			System.out.println(food.get(i));
				
		}
		
		
	}

}
