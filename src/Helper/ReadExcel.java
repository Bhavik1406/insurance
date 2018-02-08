package Helper;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	HSSFWorkbook wb;
	HSSFSheet set;

	public ReadExcel(String excelpath){

		try {
			File src = new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
			wb = new HSSFWorkbook(fis);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}
	public String getdataString(int sheetno,int row,int column){

		set = wb.getSheetAt(sheetno);
		String data = set.getRow(row).getCell(column).getStringCellValue();
		return data;

	}

	public String getdataNumeric(int sheetno,int row,int column){

		set = wb.getSheetAt(sheetno);
		String data = set.getRow(row).getCell(column).getNumericCellValue()+"";
		return data;

	}

	public int getrowcount(int sheetindex){

		int row = wb.getSheetAt(sheetindex).getLastRowNum();
		row = row+1;

		return row;
	}

}
