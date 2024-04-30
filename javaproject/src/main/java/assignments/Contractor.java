package assignments;

public class Contractor extends Employee {
	int workingHours=5;
	
	public void calculateSalary(int paymentPerHour)
	{
		payment=paymentPerHour*workingHours;
		System.out.println("Total payment for Contractor is"+payment);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor c=new Contractor();
		c.calculateSalary(800);

	}

}
