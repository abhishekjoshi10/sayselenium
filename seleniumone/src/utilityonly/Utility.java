package utilityonly;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Utility {
	String value=" ";
	WebDriver driver;
	
	//public String  excelss(int sheets, int rowsno, int cellNo) throws IOException {
		File paths = new File("");
		FileInputStream load = new FileInputStream(paths);
		XSSFWorkbook workbbks = new XSSFWorkbook(load);
		XSSFSheet sheety = workbbks.getSheetAt(sheets);
	//	CellType type = sheety.getRow(rowsno).getCell(cellNo);
		
		//if(type==CellType.NUMERIC);
		//Double num = sheety.getRow(rowsno).getCell(cellNo).getNumericCellValue();
		//int  number= (int) num;
	//	value= String.valueOf(number);
		
		
	}

}
