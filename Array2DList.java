package learn;

import java.util.ArrayList;

public class Array2DList {

	public static void main(String[] args) {
	
		
		
		ArrayList<ArrayList<String>> allshop= new ArrayList();
		
		
		
		ArrayList<String> shop=new ArrayList();
		
		shop.add("watch");
		shop.add("Mobile");
		
	ArrayList<String> shop2=new ArrayList();
		
		shop2.add("watch2");
		shop2.add("Mobile2");
		
	ArrayList<String> shop3=new ArrayList();
		
		shop3.add("watch3");
		shop3.add("Mobile3");
		
		
		allshop.add(shop);
		allshop.add(shop2);
		allshop.add(shop3);
		
		
		System.out.println(allshop.get(0).get(1));
		

	}

}
