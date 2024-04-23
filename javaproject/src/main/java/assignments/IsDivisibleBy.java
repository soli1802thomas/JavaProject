package assignments;

public class IsDivisibleBy extends Addition{
	public void check()
	{
		super.add();
		if(c%10==0)
		{
			System.out.println("Divisible by 10");
		}
		else
		{
			System.out.println("Not Divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsDivisibleBy t=new IsDivisibleBy();
		t.check();

	}

}
