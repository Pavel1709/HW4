/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoruexample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.math3.distribution.WeibullDistribution;

/**
 *
 * @author pavel1709
 */
public class EnglishFiction implements Fiction {
    public String name;
    public String author;
    ArrayList<String> nameList;
    ArrayList<String> authorList;
   ImportBooks ib;
   WeibullDistribution w;
    public static int i;

    
   EnglishFiction ( ) {
      
       setName(generateName());
       setAuthor(generateAuthor());
       System.err.println("Создана английская художественная литература"+" c названием " +"'"+ name +"'"+", написаная " + author);
   }
   @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAuthor(String author) {
       this.author = author;
    }
      @Override
    public String getName() {
       return name;
    }

    @Override
    public String getAuthor() {
      return author;
    }
    @Override
    public void generateNameandAuthorList() {
        ib = new ImportBooks();
        try {
           ib.ImportEnglishFictionName();
           ib.ImportEnglishFictionAuthor();
        } catch (IOException ex) {
            Logger.getLogger(EnglishFiction.class.getName()).log(Level.SEVERE, null, ex);
        }
        nameList = new ArrayList<String>();
        authorList = new ArrayList<String>();
        for (int i = 0; i < ib.englishFictionNames.length; i++ ) {
           nameList.add(ib.englishFictionNames[i]);
           authorList.add(ib.englishFictionAuthors[i]);
        }
    }
    @Override
    public String generateName() {
        generateNameandAuthorList();
        w =new WeibullDistribution(1, 50);
         i = (int)Math.floor(w.sample()); 
         return nameList.get(i%20);
       
    }
    @Override
    public String generateAuthor() {
      //  generateNameandAuthorList();
     //  w =new WeibullDistribution(1, 50);
   //     int i = (int)Math.floor(w.sample()); 
         return authorList.get(i%20);

    }
    }
    

