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
public class RussianFiction implements Fiction{
    
    public String author;
    public String name;
    ArrayList<String> nameList;
    ArrayList<String> authorList;
   ImportBooks ib;
   WeibullDistribution w;
    public static int i;
   RussianFiction ( ) {
       setName(generateName());
       setAuthor(generateAuthor());
       System.err.println("Создана русская художественная литература c названием," +"'"+ name +"'"+" автор: " + author);
    
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
           ib.ImportRussianFictionName();
           ib.ImportRussianFictionAuthor();
        } catch (IOException ex) {
            Logger.getLogger(RussianFiction.class.getName()).log(Level.SEVERE, null, ex);
        }
        nameList = new ArrayList<String>();
        authorList = new ArrayList<String>();

        for (int i = 0; i < ib.russianFictionNames.length; i++ ) {
           nameList.add(ib.russianFictionNames[i]);
           authorList.add(ib.russianFictionAuthors[i]);
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
       
         return authorList.get(i%20);

    }
}
