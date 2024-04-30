package assignments;
import java.util.*;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Pin");
		int p=obj.nextInt();
		b.setPin(p);
		b.validatePin();
		obj.close();
	
	}

}
