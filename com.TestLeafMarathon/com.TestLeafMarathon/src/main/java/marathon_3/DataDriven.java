package marathon_3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDriven {
	

	@Test
		public static String[][]excelConfig(String filesheet) throws IOException
		{
		XSSFWorkbook book = new XSSFWorkbook("./Data/"+filesheet+".xlsx");
		
		XSSFSheet sheet = book.getSheetAt(0);
		
		int lastRowNum = sheet.getLastRowNum();
		
		System.out.println(lastRowNum);

		int lastCellNum = sheet.getRow(1).getLastCellNum();
		
		System.out.println(lastCellNum);
		
		
		String questionData[][] = new String[lastRowNum][lastCellNum];

		for(int i=1;i<=lastRowNum;i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<lastCellNum;j++)
			{
			String cellvalue = sheet.getRow(i).getCell(j).getStringCellValue();
			
			System.out.println(cellvalue);
			
			
			questionData [i-1][j]= cellvalue;
			
			
			}
			
			book.close();
			
	
		}
		return questionData; 

	}

	}

