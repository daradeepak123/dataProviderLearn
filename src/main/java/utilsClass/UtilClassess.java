package utilsClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilClassess {




	public File file;
	public FileInputStream fis;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;






	public void getDataReturn(String filePath, String shet)
	{
		try {
			file =new File(filePath);
			fis=new FileInputStream(file);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheet(shet);			
			Iterator<Row> rowItrow=sheet.iterator();
			String[][] tabArray = null;
			 int startRow = 1;

			   int startCol = 1;

			   int ci,cj;

			   int totalRows = 10;

			   // you can write a function as well to get Column count

			   int totalCols = 7;

			   tabArray=new String[totalRows][totalCols];

			   ci=0;

			
			while(rowItrow.hasNext())
			{
				ci++;
				cj=0;
				Row row = rowItrow.next();  
				Iterator<Cell> cellIterator = row.cellIterator();
				while(cellIterator.hasNext())
				{
					cj++;
					Cell cell=cellIterator.next();

					String ss=cell.getCellType().toString();

					//System.out.print(ss + "\t\t\t");

					if(ss.equals("STRING"))
					{
						System.out.print(cell.getStringCellValue() + "\t\t\t");
						tabArray[cj][ci]=cell.getStringCellValue();
					}
					else if(ss.equals("NUMERIC"))
					{
						//System.out.print(cell.getNumericCellValue() + "\t\t\t");
						DataFormatter dataFormatter = new DataFormatter();
						String formattedCellStr = dataFormatter.formatCellValue(cell);
						System.out.print(formattedCellStr + "\t\t\t");
						tabArray[cj][ci]=formattedCellStr;
						
					}



				}
				System.out.println();
			}




		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}



	public void getData(String filePath, String shet)
	{
		try {
			file =new File(filePath);
			fis=new FileInputStream(file);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheet(shet);			
			Iterator<Row> rowItrow=sheet.iterator();			
			
			while(rowItrow.hasNext())
			{
				
				Row row = rowItrow.next();  
				Iterator<Cell> cellIterator = row.cellIterator();
				while(cellIterator.hasNext())
				{
					
					Cell cell=cellIterator.next();

					//String ss=cell.getCellType().toString();

					//System.out.print(ss + "\t\t\t");
					DataFormatter dataFormatter = new DataFormatter();
					String formattedCellStr = dataFormatter.formatCellValue(cell);
					System.out.print(formattedCellStr + "\t\t\t");

//					if(ss.equals("STRING"))
//					{
//						System.out.print(cell.getStringCellValue() + "\t\t\t");
//					}
//					else if(ss.equals("NUMERIC"))
//					{
//						System.out.print(cell.getNumericCellValue() + "\t\t\t");
//						
//					}



				}
				System.out.println();
			}




		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}




}
