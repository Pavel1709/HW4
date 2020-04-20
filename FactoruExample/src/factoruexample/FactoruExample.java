/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoruexample;

import java.io.IOException;

/**
 *
 * @author pavel1709
 */
public class FactoruExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    
     
     Manipulator DM= new Manipulator();
      DM.generateData();
      DM.initialize();


    }
}
