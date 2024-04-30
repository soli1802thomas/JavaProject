package assignments;

public class FullTimeEmployee extends Employee{
	final int workingHours=8;
	public void calculateSalary(int paymentPerHour)
	{
		payment=paymentPerHour*workingHours;
		System.out.println("Total payment for Full Time Employee is"+payment);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee e=new FullTimeEmployee();
		e.calculateSalary(1000);

	}

}
