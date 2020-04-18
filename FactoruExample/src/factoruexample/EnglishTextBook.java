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

/**
 *
 * @author pavel1709
 */
public class EnglishTextBook implements TextBook {
    String name;
    String author;
    String university;
    String level;
       ArrayList<String> nameList;
       ArrayList<String> authorList;
       ArrayList<String> universityList;
       ArrayList<String> levelList;
   ImportBooks ib;
    static int rni;
   EnglishTextBook ( ) {
       
       setName(generateName());
       setAuthor(generateAuthor());
       setLevel(generateLevel());
       setUniversity(generateUniversity());
       System.err.println("Создан английский учебник"+"'"+ name +"'"+", написаная " + author+ " в "+ university +" для " + level);
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
         
    public void setUniversity(String university) {
        this.university = university;
    }
   // @Override
    public void setLevel(String level) {
       this.level = level;
    }
     
    public String getUniversity() {
       return university;
    }

 
    //@Override
    public String getLevel() {
      return level;
    }
    
    @Override
    public void generateNameandAuthorList() {
        ib = new ImportBooks();
        try {
           ib.ImportEnglishTextBookAuthor();
           ib.ImportEnglishTextBookName();
        } catch (IOException ex) {
            Logger.getLogger(EnglishTextBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        nameList = new ArrayList<String>();
        authorList = new ArrayList<String>();
        for (int i = 0; i < ib.englishTextBookNames.length; i++ ) {
           nameList.add(ib.englishTextBookNames[i]);
           authorList.add(ib.englishTextBookAuthors[i]);
        }
    }
   // @Override
    public void generateUniversitiesAndLevelsList() {
        ib = new ImportBooks();
        try {
           ib.ImportEnglishTextBookUniversity();
           ib.ImportEnglishTextBookLevel();
           
        } catch (IOException ex) {
            Logger.getLogger(EnglishTextBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        universityList = new ArrayList<String>();
        levelList  = new ArrayList<String>();
        for (int i = 0; i < ib.englishTextBookUniversities.length; i++ ) {
           universityList.add(ib.englishTextBookUniversities[i]);
           levelList.add(ib.englishTextBookLevels[i]);
        }
    }
    @Override
    public String generateName() {
         generateNameandAuthorList() ;
        double rn = Math.random()*nameList.size();
        
          rni = (int) Math.floor(rn) ;
          if (rni == 20) {
              rni = 19;
          }
         return nameList.get(rni);
       
    }
    public String generateUniversity() {
      //   generateUniversitiesAndLevelsList() ;
      //  double rn = Math.random()*nameList.size();
        
      //   int rni = (int) Math.floor(rn) ;
       //   if (rni == 20) {
       //       rni = 19;
       //   }
         return universityList.get(rni);
       
    }
  //  @Override
     public String generateLevel() {
         generateUniversitiesAndLevelsList() ;
        //double rn = Math.random()*levelList.size();
        
        // int rni = (int) Math.floor(rn) ;
        //  if (rni == 20) {
        //      rni = 19;
        //  }
         return levelList.get(rni);
       
    }
    
    @Override
    public String generateAuthor() {
       // generateNameandAuthorList() ;
       // double rn = Math.random()*authorList.size();
        
       //  int rni = (int) Math.floor(rn) ;
       //   if (rni == 20) {
         //     rni = 19;
        //  }
         return authorList.get(rni);
       
    }
}
