package assignments;

public class Factorial {
	int f;
	
	public  void fact(int a)
	{
	f=a;
	for(int i=1;i<=a-1;i++)
	{
		f=f*i;
	}
	this.display(f);
	}
	public void display(int f)
	
	{
		System.out.println(f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj=new Factorial();
		obj.fact(5);

	}

}
