package assignments;

public class OffSeason extends OnSeason {
	int amount;
	public void discount(int amount)
	{
		super.discount(2000);
		this.amount=amount;
		System.out.println("OffSeason Discount is 15 %");
		discount=amount*0.15f;
		System.out.println("OnSeason Discount amount is "+discount);
	}

	public static void main(String[] args) {
		OffSeason of=new OffSeason();
		of.discount(2000);
	}

}
