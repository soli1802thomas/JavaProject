package inheritance;

import java.util.Scanner;

public class SalarySlip extends Calculate{
	float totSal;
	public void getTotSalary()
	{
		float totSal=basicPay+hra-pf-deduction+bonus;
		System.out.println("Your Salary Slip");
		System.out.println("Basic Pay is"+basicPay);
		System.out.println("Deduction is "+deduction);
		System.out.println("HRA is "+hra);
		System.out.println("PF is "+pf);
		System.out.println("Bonus is"+bonus);
		System.out.println("Total Salary is " +totSal);
		
	}

	public static void main(String[] args) {
	
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter the salary");
	int bp=sc1.nextInt();
	Scanner sc2=new Scanner(System.in);
	System.out.println("Enter deduction");
	int ded=sc2.nextInt();
	Scanner sc3=new Scanner(System.in);
	System.out.println("Enter bonus");
	int b=sc3.nextInt();
	SalarySlip s=new SalarySlip();
	s.set(bp, ded, b);
	s.caluclateFields();
	s.getTotSalary();

}
}
