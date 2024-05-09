package assignments;

import java.util.ArrayList;


public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> flowers=new ArrayList<String>();
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("Lotus");
		flowers.add("Tulip");
		String search="Tulip";
		
		if(flowers.contains(search))
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}

}
}
