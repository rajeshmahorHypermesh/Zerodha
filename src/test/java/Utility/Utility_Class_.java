package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class_ {
	public static String getTD(int rowindex, int colindex) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\RAJESH\\Documents\\info.xlsx");
		Sheet Sh=WorkbookFactory.create(file).getSheet("info");
		String Data = Sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return Data;
	}
	
}
