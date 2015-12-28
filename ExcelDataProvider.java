package exceldata;

import java.io.file;
import java.io.FileInputStream;
import java.io.Exception;

import jxl.cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BIffException;

public class DataDriven{

  @Test (dataProvider ="testdata")
  public void Addition(String val1, String val2, String val3){
  int a = integer.parseInt(val1);
  int b = integer.parseInt(val2);
  int c = integer.parseInt(val3);
  
  int result = a+b+c;
  System.out.println(result);
  
  }

  @DataProvider(name="testdata")
  public Object[][] readExcel() throws BiffException, IOException;
  {
  File f = newfile("C://Users//....");
  Workbook w = workbook.getworkbook(f);
  Sheet s = w.getSheet(0);
  int rows = s.getRows();
  int Columns = s.getColumns();
  //syso(rows);
  //syso(columns);
  
  String InputData[][]=new String[rows][columns];
  
  for (int i =0; i<rows; i++){
    for (int j = 0; j<columns;j++){
    cell c = s.getCell(j,i)
    inputData[i][j]=c.getContents();
    System.out.Println(InputData[i][j]);
    }
    }
  }   return InputData;

}
