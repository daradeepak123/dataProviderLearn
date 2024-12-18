package readData_Excel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilsClass.UtilClassess;

public class ReadDataExcel extends UtilClassess{
	
	
	@DataProvider(name="dp")
	public Object dataaaProvider()
	{
		
	
		 return new Object[][] { { "testuser_1", "Test@123","150","abc",50 },
			 					 { "testuser_1", "Test@123","testparameter","abc",0 },
			 					 { "testuser_2", "Test@123","test2parameter","abc",6000 } };
	
	}
	
	@Test(dataProvider = "dp",enabled=true)
	public void dataRead(Object ss,String sss,String s,String xyz,int a)
	{
		System.out.println(ss+"  "+ sss+s);
		System.out.println(a);
		//getDataReturn("C:\\demo\\employee.xlsx","Sheet1");
		//getData("C:\\demo\\employee.xlsx","Sheet1");
	}
	
	
// testuser_1    Test@123test3parameter
}
