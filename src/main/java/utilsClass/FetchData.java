package utilsClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FetchData {
	
	
	public static WebDriver driver;
	
	@Test
	public void dataFetch() throws IOException
	{

		File file=new File(System.getProperty("user.dir")+"\\src\\main\\resources\\prop.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		
		String str=prop.getProperty("browser");
		System.out.println(str);
		
		
		if(str.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(str.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		
	}
	

	

}
