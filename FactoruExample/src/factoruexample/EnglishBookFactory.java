/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoruexample;

/**
 *
 * @author pavel1709
 */
public class EnglishBookFactory implements BookFactory {
    
    
    
    
    public TextBook createTextBook() {
        return new EnglishTextBook();
    } 
    
     public Fiction createFiction() {
        return new EnglishFiction();
    } 
}
