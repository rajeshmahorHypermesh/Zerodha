package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_ActiClass {

	public static String GetTD(int rowvalue, int colvalue) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\RAJESH\\Documents\\OrangeHRM.xlsx");
		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String data = Sh.getRow(rowvalue).getCell(colvalue).getStringCellValue();
		return data;
	}
}
