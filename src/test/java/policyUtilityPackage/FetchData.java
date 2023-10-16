package policyUtilityPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData {
public static  String readDataForExcel(int row,int cel) throws EncryptedDocumentException, IOException
{    String data="";
	FileInputStream path=new FileInputStream("C:\\Users\\91935\\OneDrive\\Desktop\\New folder\\AutoEx.xlsx");
	Cell c=WorkbookFactory.create(path).getSheet("Sheet1").getRow(row).getCell(cel);
	 CellType type=c.getCellType();
	 if(type==CellType.STRING)
	 {
	 data=c.getStringCellValue();
	 }	 else if(type==CellType.NUMERIC)
	 {
		 double d=c.getNumericCellValue();
		 int num=(int)d;
		data= Integer.toString(num);
	 }
	 return data;
	 
}
}
