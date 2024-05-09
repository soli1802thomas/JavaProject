package assignments;

import java.util.ArrayList;

import java.util.*;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> flowers=new ArrayList<String>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("Lotus");
		flowers.add("Tulip");
		
		
		Iterator<String> f=flowers.iterator();
		System.out.println("Elements of Array list flowers are ");
		while(f.hasNext()) {
			
			System.out.println(f.next());
		}

	}

}
