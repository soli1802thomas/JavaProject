package abstractpackage;

public class Resident implements Apartment {

	public void getApartmentNo() {
		// TODO Auto-generated method stub
		System.out.println("Apartment number is 101");

	}

	public void address() {
		// TODO Auto-generated method stub
		System.out.println("Ebenezer Residency, Pai Layout, Bengaluru");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resident r=new Resident();
		r.address();
		r.getApartmentNo();

	}

}
