package assignments;

public class Reverse {
	int num;
	int reverse;
	public Reverse(int num)
	{
		this();
		this.num=num;
	
		while(num>0)
		{
		int lastdigit=num%10;;
		reverse=(reverse*10)+lastdigit;

		num=num/10;
		}
		System.out.println("Reverse is "+reverse);
	}
	public Reverse()
	{
		System.out.println("Finding reverse");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r=new Reverse(123456);

	}

}
