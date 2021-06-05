package test.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsxReader {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(new File("./src/test/resources/files/test.xlsx"));

			// Create Workbook instance holding reference to .xlsx file
			Workbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = (XSSFSheet) workbook.getSheet("test1");

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();

			while (rowIterator.hasNext()) {

				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					// Check the cell type and format accordingly
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + " ");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + " ");
						break;
					}
				}
				System.out.println("");
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getColumnData(String filename, String sheetname, int rownum, int colnum) {
		String val = "";
		try {
			FileInputStream file = new FileInputStream(new File("./src/test/resources/files/" + filename));

			// Create Workbook instance holding reference to .xlsx file
			Workbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = (XSSFSheet) workbook.getSheet(sheetname);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(colnum);
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_NUMERIC:
				val = val + cell.getNumericCellValue();
				break;
			case Cell.CELL_TYPE_STRING:
				val = val + cell.getStringCellValue();
				break;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return val;
	}
}
