/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoruexample;

import static factoruexample.Student.ip;
import java.io.IOException;
import java.util.*;


/**
 *
 * @author pavel1709
 */
public abstract class User {
   public int id;
    public  String name;
    public  String surname;
    public  String patronim;
    
    public static int globalID = 0;
    
    public static ArrayList<String> NameList;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronim() {
        return patronim;
    }

    public void setPatronim(String Patronim) {
        this.patronim = Patronim;
    }
    public abstract String getDivision();
    
  static ImportPeople ip ;
   
  public static void generateNameList() throws IOException {
      ip = new ImportPeople();
      ip.ImportNames();
        NameList = new ArrayList<String>();
       for (int i = 0; i<29; i++) {
       NameList.add(ip.names[i] ); 
   }
    }
 static int rni;
    public static String generateName () throws IOException {
    generateNameList();
        double rn = Math.random()*NameList.size();
        
          rni = (int) Math.floor(rn) ;
          if (rni == 29) {
              rni = 28;
          }
         return NameList.get(rni);
    }

  
         //  public abstract void generateSurNameList();
         //  public abstract String generateSurName() ;
  
           
           
    public static int generateID() {
        int newID=globalID;
        globalID++;
        return newID;
    }
}
  