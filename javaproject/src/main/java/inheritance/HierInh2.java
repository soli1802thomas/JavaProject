package inheritance;

public class HierInh2 extends HierInh1 {
	public void print1()
	{
		System.out.println("Inside first child class");
	}

	public static void main(String[] args) {
		HierInh2 a=new HierInh2();
		a.print();
		a.print1();

	}

}
