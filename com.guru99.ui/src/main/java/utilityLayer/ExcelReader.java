package utilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	static XSSFSheet sheet ;
	static XSSFWorkbook workbook;

	static FileInputStream fis;
	public ExcelReader(String path,String sheetname)
	{
	
		
				
				try {
					fis = new FileInputStream(path);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
		
		
		 try {
			workbook=new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    sheet  =workbook.getSheet(sheetname);
	}
	
	public String getspecifidata(int row,int column)
	{
		
		XSSFCell cell=sheet.getRow(row).getCell(column);
		
		if(cell.getCellType() == CellType.STRING )
		{
		return cell.getStringCellValue();
		}
		else if(cell.getCellType()==CellType.NUMERIC) {
			return cell.getRawValue();}
		
		else if (cell.getCellType()==CellType.FORMULA) 
			{
			return cell.getCellFormula();
			}
		
	       else
	       {
			return null;
	       }
		
	}
	
	List<Map<String,String>>  getallsheetdata()
	{
		int totalrows= sheet.getLastRowNum();
		
		int totalcolumns=sheet.getRow(0).getLastCellNum();
		
		List <Map<String,String>> rowtestdata= new ArrayList<Map<String,String>>();
		
		for(int i=1;i<totalrows;i++)
		{
			
		Map<String,String> columntestdata=new LinkedHashMap<String,String>();
		
		for(int j=0;j<totalcolumns;j++)
		{
			String columndata=getspecifidata(0,j);
			
			String rowdata=getspecifidata(i,j);
			
			columntestdata.put(columndata, rowdata);
			}
		
		rowtestdata.add(columntestdata);
		}
		return rowtestdata;
		
	}

}
