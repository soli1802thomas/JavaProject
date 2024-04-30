package abstractpackage;

public class Child extends AbstractEx{
	public void display()
	{
		System.out.println("This is the implementation of the abstarct method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.display();
		c.print();

	}

}
