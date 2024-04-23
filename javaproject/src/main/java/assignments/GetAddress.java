package assignments;

public class GetAddress {
	String address;
	StudentDetails s;
	public GetAddress(String address,StudentDetails s)
	{
		this.address=address;
		this.s=s;
	}
	public void disp()
	{
		System.out.println(address);
		System.out.println(s.rollNo);
		System.out.println(s.studentName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails st=new StudentDetails("Soli",32);
		GetAddress g=new GetAddress("Pearl Gardens",st);
		g.disp();
		

	}

}
