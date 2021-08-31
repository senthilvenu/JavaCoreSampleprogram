package JavaSampleprogram;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.Test;


class Excelsheet {
	
	public static  XSSFWorkbook wb;
	public static  XSSFSheet sheet;
		 
	
	//Excelsheet(String excelpath) throws IOException
	public static void main(String arg[]) throws IOException
	
	{
		File scr=new File("C:\\Users\\siva\\eclipse-workspace\\Dataprovider\\Data\\Data.xlsx");;
		FileInputStream Fis =new FileInputStream(scr);
		 wb = new XSSFWorkbook(Fis);
		 sheet = wb.getSheetAt(0);
		String username=sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Cell value is:"+ username);
		String Password=sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Cell value is:"+ Password);
		}
	
}
