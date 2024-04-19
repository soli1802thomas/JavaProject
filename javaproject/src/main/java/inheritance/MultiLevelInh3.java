package inheritance;

public class MultiLevelInh3 extends MultiLevelInh2 {
	public void show3()
	{
		System.out.println("Inside child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInh3 i=new MultiLevelInh3();
		i.show();
		i.show1();
		i.show3();

	}

}
