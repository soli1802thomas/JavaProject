package polymorphism;

public class SuperMarket extends Shop{
	public void show()
	
	{
		super.show();
		System.out.println("This is asupermarket");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMarket s=new SuperMarket();
		s.show();

	}

}
