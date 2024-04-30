package assignments;

public class Hdfc implements RBI {

	public void recurringDeposit(int amount, int duration) {
		float returnAmount=amount*duration*intRate+amount;
		System.out.println("Return amount is "+returnAmount);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc h=new Hdfc();
		h.recurringDeposit(10000, 5);

	}

}
