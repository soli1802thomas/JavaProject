package assignments;

public class OnSeason {
	int amount;
	float discount;
	
	public void discount(int amount)
	{
		this.amount=amount;
		System.out.println("OnSeason Discount is 40 %");
		discount=amount*0.40f;
		System.out.println("Discount amount is "+discount);
	}
}
