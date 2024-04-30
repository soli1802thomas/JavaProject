package superkeywordpkg;

public class SuperChildClass2 extends Super2{
	public void display()
	
	{
		super.display();
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		SuperChildClass2 obj=new SuperChildClass2();
		obj.display();
		

	}

}
