package abstractpackage;

public class Child1 implements Parent1, Parent2 {

	public void showAge() {
		// TODO Auto-generated method stub
		System.out.println("Age is 30");

	}

	public void showName() {
		// TODO Auto-generated method stub
		System.out.println("Name is Anand");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c=new Child1();
		
		c.showName();
		c.showAge();

	}

}
