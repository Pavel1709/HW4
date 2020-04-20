/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoruexample;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pavel1709
 */
public class Manipulator {
    ArrayList<User> users ;
   // ArrayList<Books> Books;
    ArrayList<Records> Records;
    ArrayList<Journal> Journals;
    Student st;
            public Manipulator() {
                
            }
            public void initialize() throws IOException {
                
                User.generateNameList() ;
                
                Student.generateGroupNameList();
                Student.generateSurNameList();
                
                Teacher.generateDepartmentList();
                Teacher.generateSurNameList();
                Teacher.generatePatronimListForMen();
                Teacher.generatePatronimListForWomen();
                
            }
            
            public void generateData() throws IOException {
               // UserFactory UF = new UserFactory();
             //   users = UF.createUsers(20); 
                JournalDataManipulator JDM = new JournalDataManipulator();
                Journals = JDM.createJournals();
                BookDataManipulator BDM = new BookDataManipulator();
                BDM.createTestBook();
                
                System.out.println("VSE");
                UserFactory1 UF = new UserFactory1();
                UF.createUsers(100);
            }
            
            
            
            
          private static class JournalDataManipulator {
              
                public JournalDataManipulator() {
                    
                }
                   public ArrayList<Journal> createJournals() {
        
        ArrayList<Journal> journals = new ArrayList<Journal>();
        
        JournalDirector JD = new JournalDirector();
        
      
        JD.setJB(new PhysicsJournalBuilder());
        journals.addAll(createThematicalJournals(JD));
        
        
        JD.setJB(new AstronomicalJournalBuilder());
        journals.addAll(createThematicalJournals(JD));
        return journals;
    }
    
    public ArrayList<Journal> createThematicalJournals(JournalDirector JD) {
        
    ArrayList<Journal> thematicalJournals = new ArrayList<Journal>();
    
   // ArrayList<Journal> AstronomicalJournals = new ArrayList<Journal>();
    while (! JD.isJournalsIsOver()) {
    JD.createJournal();
    thematicalJournals.add(JD.getJournal());
    } 
    return thematicalJournals;
            }
}
          private static class BookDataManipulator {
              public BookDataManipulator() {
                  
              }
              public void createTestBook() {
                  
               ArrayList<Bookable> bookList = new ArrayList<Bookable> ();
              BookFactory factory;
              int i = 0;
              while (i<100) {
                  int R = i- (int) Math.floor(i/4)*4;
                    switch (R) {
                        case 0: {factory = new RussianBookFactory(); 
                        bookList.add(factory.createFiction());}
                        break;
                        case 1: {factory = new RussianBookFactory(); 
                        bookList.add(factory.createTextBook());}
                        break;
                        case 2: {factory = new EnglishBookFactory(); 
                        bookList.add(factory.createFiction());}
                        break;
                        case 3: {factory = new EnglishBookFactory(); 
                        bookList.add(factory.createTextBook());}
                        break;
                        
                    }
                          i++;
                      }
              
          }
          }
}
