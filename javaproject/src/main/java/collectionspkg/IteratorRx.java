package collectionspkg;
import java.util.*;

public class IteratorRx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c=new ArrayList<String>();
		c.add("Red");
		c.add("Blue");
		c.add("Green");
		
		Iterator<String> i=c.iterator();
				
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(c);
		
		
		

	}

}
