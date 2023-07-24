package readData_Excel;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilsClass.ExcelReaderArrays;
import utilsClass.UtilClassess;

public class ReadDataSpreadSheet {

	
	
	@DataProvider
	public Object[][] hello() throws IOException
	{
		ExcelReaderArrays oo=new ExcelReaderArrays();
		
		return   oo.excelArray();
	}
	
	@Test (dataProvider = "hello")
	public  void testthis(String s,String ss,String sss,String ssss,String sssss) throws IOException {
		// TODO Auto-generated method stub
		UtilClassess o=new UtilClassess();
		//o.getData("C:\\demo\\employee.xlsx","Sheet1");
		System.out.println(s+" \t" +ss+" \t"+sss+" \t"+ssss+" \t"+sssss);
		
		
		

	}

}
