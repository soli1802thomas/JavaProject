package encapsulation;

public class Area {
	private int length;
	private int breadth;
	public void getArea(int length, int breadth)
	{
		
		int a=length*breadth;
		System.out.println("Areas is"+a);
	}
	/*public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}*/

}
