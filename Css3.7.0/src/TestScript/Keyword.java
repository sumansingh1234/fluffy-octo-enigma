package TestScript;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Keyword {
	public static void main(String[] args) throws IOException {
		ArrayList a = new ArrayList();

		FileInputStream fis1 = new FileInputStream(new File("C:\\Users\\name\\Desktop\\LeadSuit.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook (fis1);
		Sheet sheet = workbook.getSheet("sheet");
		Iterator itr = sheet.iterator();
		while (itr.hasNext()){
			Row rowitr =(Row)itr.next();
			Iterator cellitr=rowitr.cellIterator();
			while(cellitr.hasNext()) {
				Cell celldata =(Cell)cellitr.next();
				switch
				(celldata.getCellType()){
				case STRING:
					a.add(celldata.getStringCellValue());
					break;
				case NUMERIC:
					a.add(celldata.getNumericCellValue());
					break;
				case BOOLEAN:
					a.add(celldata.getBooleanCellValue());
					break;
				}
			}
		}
		
		for(int i=0;i<a.size();i++) {
			if(a.get(i).equals("Openbrowser")) {
				String Keyword = (String)a.get(i);
				String deta =(String)a.get(i+1);
				String objectname =(String)a.get(i+2);
				String runmode =(String)a.get(i+3);
				System.out.println(Keyword);
				System.out.println(deta);
				System.out.println(objectname);
				System.out.println( runmode);	
			}
		}
		
		for(int i=0;i<a.size();i++) {
			if(a.get(i).equals("Navigate")) {
				String Keyword = (String)a.get(i);
				String deta =(String)a.get(i+1);
				String objectname =(String)a.get(i+2);
				String runmode =(String)a.get(i+3);
				System.out.println(Keyword);
				System.out.println(deta);
				System.out.println(objectname);
				System.out.println( runmode);	
			}
		}
		
		for(int i=0;i<a.size();i++) {
			if(a.get(i).equals("input")) {
				String Keyword = (String)a.get(i);
				String deta =(String)a.get(i+1);
				String objectname =(String)a.get(i+2);
				String runmode =(String)a.get(i+3);
				System.out.println(Keyword);
				System.out.println(deta);
				System.out.println(objectname);
				System.out.println( runmode);
			}
		}
		
		for(int i=0;i<a.size();i++) {
			if(a.get(i).equals("input")) {
				String Keyword = (String)a.get(i);
				String deta =(String)a.get(i+1);
				String objectname =(String)a.get(i+2);
				String runmode =(String)a.get(i+3);
				System.out.println(Keyword);
				System.out.println(deta);
				System.out.println(objectname);
				System.out.println( runmode);	
			}
		}
		for(int i=0;i<a.size();i++) {
			if(a.get(i).equals("click")) {
				String Keyword = (String)a.get(i);
				String deta =(String)a.get(i+1);
				String objectname =(String)a.get(i+2);
				String runmode =(String)a.get(i+3);
				System.out.println(Keyword);
				System.out.println(deta);
				System.out.println(objectname);
				System.out.println( runmode);
			}
		}
		
		for(int i=0;i<a.size();i++) {
			if(a.get(i).equals("clickoncontact")) {
				String Keyword = (String)a.get(i);
				String deta =(String)a.get(i+1);
				String objectname =(String)a.get(i+2);
				String runmode =(String)a.get(i+3);
				System.out.println(Keyword);
				System.out.println(deta);
				System.out.println(objectname);
				System.out.println( runmode);
			}
		}
		
		
}
}