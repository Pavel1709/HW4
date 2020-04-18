/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoruexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author pavel1709
 */
public class ImportPeople {
    //ArrayList nums = new ArrayList();
//HashMap MyExport = new HashMap <String, String[]>();
String[] studentsSurnames;
String[] teachersSurnames;
public String[] names;
    public void ImportNames() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("NamesAndSurnames.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet= myBook.getSheet("Names");
     int rowCount=MySheet.getPhysicalNumberOfRows();
     
     HSSFRow headers=MySheet.getRow(0);
     for(int i=0;i<headers.getPhysicalNumberOfCells();i++) {
         HSSFCell header=headers.getCell(i);
         String ColName=header.getStringCellValue();
         names=new String[rowCount-1];
         int k = 0;
         for (int j=1 ; j< rowCount;j++) {
             names[k]=MySheet.getRow(j).getCell(i).getStringCellValue();
             k++;
         }
       //  MyExport.put(ColName, names);
     }

    }
    public void ImportTeahersSurNames() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("NamesAndSurnames.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet1= myBook.getSheet("TeachersSurnames");
     int rowCount1=MySheet1.getPhysicalNumberOfRows();
     
     HSSFRow headers1=MySheet1.getRow(0);
     for(int l=0;l<headers1.getPhysicalNumberOfCells();l++) {
         HSSFCell header=headers1.getCell(l);
         String ColName=header.getStringCellValue();
         teachersSurnames=new String[rowCount1-2];
         int k = 0;
         for (int n=1 ; n< rowCount1-1;n++) {
             teachersSurnames[k]=MySheet1.getRow(n).getCell(l).getStringCellValue();
             k++;
         }
      //   MyExport.put(ColName, teachersSurnames);
     }

    }
    public void ImportStudentsSurNames() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("NamesAndSurnames.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet1= myBook.getSheet("StudentsSurnames");
     int rowCount1=MySheet1.getPhysicalNumberOfRows();
     
     HSSFRow headers1=MySheet1.getRow(0);
     for(int l=0;l<headers1.getPhysicalNumberOfCells();l++) {
         HSSFCell header=headers1.getCell(l);
         String ColName=header.getStringCellValue();
         studentsSurnames=new String[rowCount1-2];
         int k = 0;
         for (int n=1 ; n< rowCount1-1;n++) {
             studentsSurnames[k]=MySheet1.getRow(n).getCell(l).getStringCellValue();
             k++;
         }
         //MyExport.put(ColName, studentsSurnames);
     }

    }
      public void printValues(Map <String, String[]> map) {
   for(Map.Entry<String, String[]> pair:map.entrySet()){
    String[] value1=pair.getValue();
    System.out.println(Arrays.toString(value1));
}
}
}