package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public static String readExcel(int row, int column) throws IOException {
		String testData=null;
		try {
			//Object[][] testdata = null;
			//Getting the Relative path for excel from Source Excel folder
			String filePath = System.getProperty("user.dir")+"//Excel//test_maven.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet ws = wb.getSheetAt(0);
			testData = String.valueOf(ws.getRow(row).getCell(column));
			System.out.println(testData);
			wb.close();
		}catch(Exception e)
		{
			System.out.println("Excel Read");
		}
		return testData;
	}
	public static String config(String data)  {
		
		try {
			
			String filelocation = System.getProperty("user.dir") + "\\Application_configruation\\config.properties";
			File file = new File(filelocation);
			FileInputStream fileinput = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileinput);
			String p=prop.getProperty(data);
			return p;
			
			}
		catch(Exception e) {}
		return null;
		
	}
	

}
