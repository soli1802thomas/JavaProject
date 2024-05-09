package excelreadpkg;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s1=ExcelCode.readIntegerData(2, 1);
		System.out.println(s1);
		String s2=ExcelCode.readStringData(2, 0);
		System.out.println(s2);

	}

}
