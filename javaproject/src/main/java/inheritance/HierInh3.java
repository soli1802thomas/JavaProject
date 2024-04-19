package inheritance;

public class HierInh3  extends HierInh1{
	public void print2()
	{
	System.out.println("In second child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierInh3 o=new HierInh3();
				o.print();
				o.print2();

	}

}
