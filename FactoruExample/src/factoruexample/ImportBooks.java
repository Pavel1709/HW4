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
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author pavel1709
 */
public class ImportBooks {
    
    //ArrayList nums = new ArrayList();
//HashMap MyExport = new HashMap <String, String[]>();
String[] russianFictionNames;
String[] russianTextBookNames;
String[] englishTextBookNames;
String[] englishFictionNames;
String[] russianFictionAuthors;
String[] russianTextBookAuthors;
String[] englishTextBookAuthors;
String[] englishFictionAuthors;
String[] englishTextBookUniversities;
String[] englishTextBookLevels;
    public void ImportRussianFictionName() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("Books.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet= myBook.getSheet("RussianFiction");
     int rowCount=MySheet.getPhysicalNumberOfRows();
     
     HSSFRow headers=MySheet.getRow(0);
     
     for(int i=0;i<headers.getPhysicalNumberOfCells()-1;i++) {
         HSSFCell header=headers.getCell(i);
         String ColName=header.getStringCellValue();
         russianFictionNames=new String[rowCount-1];
         
         int k = 0;
         for (int j=1 ; j< rowCount;j++) {
             russianFictionNames[k]=MySheet.getRow(j).getCell(i).getStringCellValue();
             k++;
         }
     
     }
}
     public void ImportRussianFictionAuthor() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("Books.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet= myBook.getSheet("RussianFiction");
     int rowCount=MySheet.getPhysicalNumberOfRows();
     
     HSSFRow headers=MySheet.getRow(0);
     for(int i=1;i<headers.getPhysicalNumberOfCells();i++) {
         HSSFCell header=headers.getCell(i);
         String ColName=header.getStringCellValue();
         russianFictionAuthors=new String[rowCount-1];
         int k = 0;
         for (int j=1 ; j< rowCount;j++) {
             russianFictionAuthors[k]=MySheet.getRow(j).getCell(i).getStringCellValue();
             k++;
         }
      
     }
}
     public void ImportEnglishFictionName() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("Books.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet= myBook.getSheet("EnglishFiction");
     int rowCount=MySheet.getPhysicalNumberOfRows();
     
     HSSFRow headers=MySheet.getRow(0);
     for(int i=0;i<headers.getPhysicalNumberOfCells()-1;i++) {
         HSSFCell header=headers.getCell(i);
         String ColName=header.getStringCellValue();
         englishFictionNames = new String[rowCount-1];
         int k = 0;
         for (int j=1 ; j< rowCount;j++) {
             englishFictionNames[k]=MySheet.getRow(j).getCell(i).getStringCellValue();
             k++;
        }
    }
    }
    public void ImportEnglishFictionAuthor() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("Books.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet= myBook.getSheet("EnglishFiction");
     int rowCount=MySheet.getPhysicalNumberOfRows();
     
     HSSFRow headers=MySheet.getRow(0);
     for(int i=1;i<headers.getPhysicalNumberOfCells();i++) {
         HSSFCell header=headers.getCell(i);
         String ColName=header.getStringCellValue();
         englishFictionAuthors=new String[rowCount-1];
         int k = 0;
         for (int j=1 ; j< rowCount;j++) {
             englishFictionAuthors[k]=MySheet.getRow(j).getCell(i).getStringCellValue();
             k++;
         }
    }
    }
    public void ImportEnglishTextBookName() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("Books.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet= myBook.getSheet("EnglishTextBook");
     int rowCount=MySheet.getPhysicalNumberOfRows();
     
     HSSFRow headers=MySheet.getRow(0);
     for(int i=0;i<headers.getPhysicalNumberOfCells()-3;i++) {
         HSSFCell header=headers.getCell(i);
         String ColName=header.getStringCellValue();
        englishTextBookNames=new String[rowCount-1];
         int k = 0;
         for (int j=1 ; j< rowCount;j++) {
             englishTextBookNames[k]=MySheet.getRow(j).getCell(i).getStringCellValue();
             k++;
         }
    }
    }
    public void ImportEnglishTextBookAuthor() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("Books.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet= myBook.getSheet("EnglishTextBook");
     int rowCount=MySheet.getPhysicalNumberOfRows();
     
     HSSFRow headers=MySheet.getRow(0);
     for(int i=1;i<headers.getPhysicalNumberOfCells()-2;i++) {
         HSSFCell header=headers.getCell(i);
         String ColName=header.getStringCellValue();
        englishTextBookAuthors=new String[rowCount-1];
         int k = 0;
         for (int j=1 ; j< rowCount;j++) {
             englishTextBookAuthors[k]=MySheet.getRow(j).getCell(i).getStringCellValue();
             k++;
         }
    }
    }
    public void ImportEnglishTextBookUniversity() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("Books.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet= myBook.getSheet("EnglishTextBook");
     int rowCount=MySheet.getPhysicalNumberOfRows();
     
     HSSFRow headers=MySheet.getRow(0);
     for(int i=2;i<headers.getPhysicalNumberOfCells()-1;i++) {
         HSSFCell header=headers.getCell(i);
         String ColName=header.getStringCellValue();
        englishTextBookUniversities=new String[rowCount-1];
         int k = 0;
         for (int j=1 ; j< rowCount;j++) {
             englishTextBookUniversities[k]=MySheet.getRow(j).getCell(i).getStringCellValue();
             k++;
         }
    }
    }
     public void ImportEnglishTextBookLevel() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("Books.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet= myBook.getSheet("EnglishTextBook");
     int rowCount=MySheet.getPhysicalNumberOfRows();
     
     HSSFRow headers=MySheet.getRow(0);
     for(int i=3;i<headers.getPhysicalNumberOfCells();i++) {
         HSSFCell header=headers.getCell(i);
         String ColName=header.getStringCellValue();
        englishTextBookLevels=new String[rowCount-1];
         int k = 0;
         for (int j=1 ; j< rowCount;j++) {
             englishTextBookLevels[k]=MySheet.getRow(j).getCell(i).getStringCellValue();
             k++;
         }
    }
    }
    public void ImportRussianTextBookName() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("Books.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet= myBook.getSheet("RussianTextBook");
     int rowCount=MySheet.getPhysicalNumberOfRows();
     
     HSSFRow headers=MySheet.getRow(0);
     for(int i=0;i<headers.getPhysicalNumberOfCells()-1;i++) {
         HSSFCell header=headers.getCell(i);
         String ColName=header.getStringCellValue();
         russianTextBookNames=new String[rowCount-1];
         int k = 0;
         for (int j=1 ; j< rowCount;j++) {
               russianTextBookNames[k]=MySheet.getRow(j).getCell(i).getStringCellValue();
             k++;
         }
    }
    }
    public void ImportRussianTextBookAuthor() throws FileNotFoundException, IOException {
        
     Path file_path=FileSystems.getDefault().getPath("Books.xls"); //filesystems-работа со всеми файлами компьютера,getDefaul-смотрим папку, где находится наша прога, getpath-получаем путь к ней
     HSSFWorkbook myBook= new HSSFWorkbook(new FileInputStream(file_path.toString()));
     HSSFSheet MySheet= myBook.getSheet("RussianTextBook");
     int rowCount=MySheet.getPhysicalNumberOfRows();
     
     HSSFRow headers=MySheet.getRow(0);
     for(int i=1;i<headers.getPhysicalNumberOfCells();i++) {
         HSSFCell header=headers.getCell(i);
         String ColName=header.getStringCellValue();
         russianTextBookAuthors=new String[rowCount-1];
         int k = 0;
         for (int j=1 ; j< rowCount;j++) {
               russianTextBookAuthors[k]=MySheet.getRow(j).getCell(i).getStringCellValue();
             k++;
         }
    }
    }
}
