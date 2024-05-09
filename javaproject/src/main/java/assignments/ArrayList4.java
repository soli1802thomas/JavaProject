package assignments;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> places=new ArrayList<String>();
		places.add("Kottayam");
		places.add("Trivandrum");
		places.add("France");
		places.add("Ernakulam");
		places.add("Aleppey");
		System.out.println(places);
		places.remove(2);
		System.out.println("After removing the 3rd element,"
				+ " places array list has the below elements");
		System.out.println(places);
		
		

	}

}
