package superkeywordpkg;

public class SuperChildClass extends Super1{
	String a="Welcome";
	public void display()
	{
		System.out.println(a);
		System.out.println(super.a);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildClass ob=new SuperChildClass();
		ob.display();
		
		
	}

}
