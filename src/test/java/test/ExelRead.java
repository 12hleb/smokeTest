package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExelRead {
    public static void main(String[] args) {
        File file = new File("/Users/admin/Desktop/Untitled spreadsheet.xlsx");
//        System.out.println(file.exists());
        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream(file);




        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

            XSSFSheet sheet = workbook.getSheet("Employees");

            System.out.println( sheet.getRow(2).getCell(1));

            int usedRows  = sheet.getPhysicalNumberOfRows();

            int lastUserRow = sheet.getLastRowNum();
            System.out.println(usedRows +" " + lastUserRow);
        }catch (Exception e){
            System.out.println("file issue");
            fileInputStream = null;
        }
    }
}
