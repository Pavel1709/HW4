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
public class Teacher extends User {
      static ImportPeople ip;
   public String groupName ;
  private static ArrayList <String> DepartmentList;
  
  private static ArrayList <String> SurNameList;
   private static ArrayList <String> patronimsListforMen ;
   private static ArrayList <String> patronimsListforWomen ;
   public Teacher () throws IOException {
       
       this.setName(User.generateName());
       this.setId(User.generateID());
       this.setDepartment(generateDepartment());
       this.setSurname(generateSurName());
       this.setPatronim(generatePatronim());
      
   }
    public String department;
      @Override
    public String getDivision() {
       return department;
    }
     public void setDepartment(String department) {
        this.department=department;
    }
       public static void generateDepartmentList() {
        DepartmentList = new ArrayList<String>();
        DepartmentList.add("ИИКС");
        DepartmentList.add("ФБИУКС");
        DepartmentList.add("ИФТЭБ");
        DepartmentList.add("ИЯФИТ");
    }
       
       public static String generateDepartment () {
        generateDepartmentList();
        double rn = Math.random()*DepartmentList.size();
        
         int rni = (int) Math.floor(rn) ;
          if (rni == 4) {
              rni = 3;
          }
         return DepartmentList.get(rni);
}
    
   
  
     
         public static void generateSurNameList()  {
           ip = new ImportPeople();
        SurNameList = new ArrayList<String>();
          try {
              ip.ImportTeahersSurNames();
          } catch (IOException ex) {
              Logger.getLogger(Teacher.class.getName()).log(Level.SEVERE, null, ex);
          }
        for (String surnames: ip.teachersSurnames ) {
        SurNameList.add(surnames);
        }
       
    }
         
        public static String generateSurName () {
        generateSurNameList();
        double rn = Math.random()*SurNameList.size();
        
         int rni = (int) Math.floor(rn) ;
          if (rni == 61) {
              rni = 60;
          }
         return SurNameList.get(rni);
}
     
        public static void generatePatronimListForMen() throws IOException {
            String pat ="";
            ip = new ImportPeople();
            ip.ImportNames();
          
             patronimsListforMen = new ArrayList<String> ();
            for (String names: ip.names) {
                if  (  (names.charAt(names.length()-1) != 'a') && (names.charAt(names.length()-1) != 'я')) {
                       switch (names.charAt(names.length()-1)) {
                           case ('н') : patronimsListforMen.add(names+"ович");
                           break;
                           case ('р') : patronimsListforMen.add(names+"ович");
                           break;
                           case ('в') : patronimsListforMen.add(names+"ович");
                           break;
                           case ('с') : patronimsListforMen.add(names+"ович");
                           break;
                            case('й') : { 
                               for (int i = 0; i< names.length()-1; i++) {
                                   pat+=names.charAt(i);
                               }
                               patronimsListforMen.add(pat+"евич"); }
                            pat="";
                               break; 
                           
                               
                }
                       
                }    
        }
           
}
        public static void generatePatronimListForWomen() throws IOException {
            String pat ="";
            ip = new ImportPeople();
            ip.ImportNames();
          
             patronimsListforWomen = new ArrayList<String> ();
            for (String names: ip.names) {
                if  (  (names.charAt(names.length()-1) != 'a') && (names.charAt(names.length()-1) != 'я')) {
                       switch (names.charAt(names.length()-1)) {
                           case ('н') : patronimsListforWomen.add(names+"овна");
                           break;
                           case ('р') : patronimsListforWomen.add(names+"овна");
                           break;
                           case ('в') : patronimsListforWomen.add(names+"овна");
                           break;
                           case ('с') : patronimsListforWomen.add(names+"овна");
                           break;
                            case('й') : { 
                               for (int i = 0; i< names.length()-1; i++) {
                                   pat+=names.charAt(i);
                               }
                               patronimsListforWomen.add(pat+"евна"); }
                            pat="";
                               break; 
                           
                               
                }
                       
                }    
        }
           
}
        
        public static String generatePatronim () throws IOException {
       generateNameList();
        String p="";
      
         //generateName();
        generatePatronimListForWomen();
        generatePatronimListForMen();
       
         switch (User.NameList.get(User.rni).charAt(User.NameList.get(User.rni).length()-1)) {
              case('а') : {
         
        double rn = Math.random()*patronimsListforWomen.size();
        
         int rni = (int) Math.floor(rn) ;
          if (rni == 12) {
              rni = 11;
          }
         p = patronimsListforWomen.get(rni); 
              }
              break;
       
              case('я') : {
         
        double rn = Math.random()*patronimsListforWomen.size();
        
         int rni = (int) Math.floor(rn) ;
          if (rni == 12) {
              rni = 11;
          }
         p = patronimsListforWomen.get(rni); 
              }
              break;
         case'в' : {
         
        double rn = Math.random()*patronimsListforMen.size();
        
         int rni = (int) Math.floor(rn) ;
          if (rni == 12) {
              rni = 11;
          }
         p = patronimsListforMen.get(rni); 
              }
              break;

         case'й' : {
         
        double rn = Math.random()*patronimsListforMen.size();
        
         int rni = (int) Math.floor(rn) ;
          if (rni == 12) {
              rni = 11;
          }
         p = patronimsListforMen.get(rni); 
              }
              break;
              case'н' : {
         
        double rn = Math.random()*patronimsListforMen.size();
        
         int rni = (int) Math.floor(rn) ;
          if (rni == 12) {
              rni = 11;
          }
         p = patronimsListforMen.get(rni); 
              }
              break;
              case'с' : {
         
        double rn = Math.random()*patronimsListforMen.size();
        
         int rni = (int) Math.floor(rn) ;
          if (rni == 12) {
              rni = 11;
          }
         p = patronimsListforMen.get(rni); 
              }
              break;
              case'р' : {
         
        double rn = Math.random()*patronimsListforMen.size();
        
         int rni = (int) Math.floor(rn) ;
          if (rni == 12) {
              rni = 11;
          }
         p = patronimsListforMen.get(rni); 
              }
              break;
}

         return p;
        
}
}