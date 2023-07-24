package utilsClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReaderArrays {
	
	public String[][] excelArray() throws IOException
	{
		
		
		File file=new File("C:\\demo\\employee.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sht= wb.getSheet("Sheet1");
		
		
		int lastRow=sht.getLastRowNum();
		int lastColumn=sht.getRow(0).getLastCellNum();
		String dataaa[][]=new String[lastRow+1][lastColumn];
		
		
		
		for(int i=0;i<=lastRow;i++)
		{
			for(int j=0;j<lastColumn;j++)
			{
				DataFormatter dataFormatter = new DataFormatter();
				String formattedCellStr = dataFormatter.formatCellValue(sht.getRow(i).getCell(j));
				//System.out.print(formattedCellStr + "\t\t\t");
				dataaa[i][j]=formattedCellStr;
			}
			//System.out.println();
		}
		
//		for(String ss[]:data)
//		{
//			System.out.println(Arrays.toString(ss));
//		}
		
		
		
		
		return dataaa;
		
		
		
	}
	
	
	
	
	

}
