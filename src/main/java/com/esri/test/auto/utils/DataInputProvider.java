package com.esri.test.auto.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.esri.test.auto.wrappers.GenericWrappers;

/**This is to read the test data from the workbook
 * @author balajih
 *
 */
public class DataInputProvider  extends GenericWrappers{
	private String fileLocation;

	public static String[][] getSheet(String dataSheetName) throws IOException{
		String[][] data=null;

		try {
			FileInputStream fis = new FileInputStream(new File("./data/"+dataSheetName+".xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rowCount = sheet.getLastRowNum();
			int columnCount = sheet.getRow(0).getLastCellNum();
			data = new String[rowCount][columnCount];
			try {
				for (int i = 1; i<rowCount+1;i++){
					XSSFRow row = sheet.getRow(i);
					for (int j=0;j<columnCount;j++){
						try {
							String cellValue = "";
							try {
								cellValue = row.getCell(j).getStringCellValue();
							} catch (NullPointerException e) {
								e.printStackTrace();
							}
							data[i-1][j]=cellValue;
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			workbook.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	/*public DataInputProvider(String fileLocation) {
        this.fileLocation = fileLocation;
    }



    public HashMap<String,String[]> getData(String txtData){
        FileInputStream fs;
        HashMap<String,String[]> keyValuePair=new HashMap<String,String[]>();
        try (BufferedReader br = new BufferedReader(new FileReader("./src/test/resources/"+txtData+".txt"))){
            String stringLine;
            //Read File Line By Line
            while ((stringLine = br.readLine()) != null)   {
                // Print the content on the console
                String[] keyValue=stringLine.split("=");
                keyValuePair.put(keyValue[0],keyValue[1].split(","));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


        return keyValuePair;


    }*/

}


