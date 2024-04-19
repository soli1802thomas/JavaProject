package inheritance;

public class SingleInh2 extends SingleInh1{
	public void display1()
	{
		System.out.println("In child class");
	}

	public static void main(String[] args) {
		
SingleInh2 o=new SingleInh2();
o.display();
o.display1();
	}

}
