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
public interface Bookable {
    public void setName(String name);
    public String getName();
    public void setAuthor(String author);
    public String getAuthor();
    public void generateNameandAuthorList();
    public String generateName();
    public String generateAuthor();
  
}
