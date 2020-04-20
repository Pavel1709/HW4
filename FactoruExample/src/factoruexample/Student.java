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
public class Student extends User {
   static ImportPeople ip;
   public String groupName ;
  private static ArrayList <String> GroupNameList;
  private static ArrayList <String> NameList;
  private static ArrayList <String> SurNameList;
   public Student () throws IOException {
       
       this.setName(User.generateName());
       this.setId(User.generateID());
       this.setGroupName(generateGroupName());
       this.setSurname(generateSurName());
   }
   
    @Override
    public String getDivision() {
       return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName=groupName;
    }
       public static void generateGroupNameList() {
        GroupNameList = new ArrayList<String>();
        GroupNameList.add("B18-901");
        GroupNameList.add("B17-901");
        GroupNameList.add("B16-901");
        GroupNameList.add("B19-901");
    }
       
       public static String generateGroupName () {
        generateGroupNameList();
        double rn = Math.random()*GroupNameList.size();
        
         int rni = (int) Math.floor(rn) ;
          if (rni == 4) {
              rni = 3;
          }
         return GroupNameList.get(rni);
}
       
    
         
        
         public static void generateSurNameList() {
           ip = new ImportPeople();
       try {
           ip.ImportStudentsSurNames();
       } catch (IOException ex) {
           Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
       }
        SurNameList = new ArrayList<String>();
        for (String surnames: ip.studentsSurnames ) {
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
}
        