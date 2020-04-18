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
  private static ArrayList <String> NameList;
  private static ArrayList <String> SurNameList;
   private static ArrayList <String> patronimsList ;
   public Teacher () {
       
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
        
        double rn = Math.random()*SurNameList.size();
        
         int rni = (int) Math.floor(rn) ;
          if (rni == 61) {
              rni = 60;
          }
         return SurNameList.get(rni);
}
     
        public static void generatePatronimList() throws IOException {
            String pat ="";
            ip = new ImportPeople();
            ip.ImportNames();;
          
             patronimsList = new ArrayList<String> ();
            for (String names: ip.names) {
                if  (  (names.charAt(names.length()-1) != 'a') && (names.charAt(names.length()-1) != 'я')) {
                       switch (names.charAt(names.length()-1)) {
                           case ('н') : patronimsList.add(names+"ович");
                           break;
                           case ('р') : patronimsList.add(names+"ович");
                           break;
                           case ('в') : patronimsList.add(names+"ович");
                           break;
                           case ('с') : patronimsList.add(names+"ович");
                           break;
                            case('й') : { 
                               for (int i = 0; i< names.length()-1; i++) {
                                   pat+=names.charAt(i);
                               }
                               patronimsList.add(pat+"евич"); }
                            pat="";
                               break; 
                           
                               
                }
                       
                }    
        }
           
}
        public static String generatePatronim () {
        
        double rn = Math.random()*patronimsList.size();
        
         int rni = (int) Math.floor(rn) ;
          if (rni == 12) {
              rni = 11;
          }
         return SurNameList.get(rni);
}

}