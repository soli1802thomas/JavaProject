package assignments;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> animals=new ArrayList<String>();
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Horse");
		animals.add("Pig");
		String pos=animals.get(3);
		System.out.println("At 3rd position, the animal is "+pos);
		

	}

}
