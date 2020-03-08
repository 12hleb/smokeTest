package test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExelWrite {
    public static void main(String[] args) {
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;

        try {
            String path = "/Users/admin/Desktop/Untitled spreadsheet.xlsx";
            FileInputStream fileInputStream = new FileInputStream(path);

            workbook = new XSSFWorkbook(fileInputStream);
            sheet = workbook.getSheet("Employees");
            row = sheet.getRow(1);
            cell = row.getCell(1);

            XSSFCell adamsCell = sheet.getRow(2).getCell(0);

            System.out.println("Before ");
        }catch (Exception e){
            System.out.println("fdojg");
        }

    }
}
