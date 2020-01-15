package TestScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Keyword {
	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream(new File("C:\\Users\\name\\Desktop\\LeadSuit.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook (fis1);
		XSSFSheet sheet = workbook.getSheetAt(1);
		
}
}