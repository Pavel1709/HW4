/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoruexample;

import java.util.ArrayList;

/**
 *
 * @author pavel1709
 */
public class UserFactory {
    public UserFactory() {
        
    }
    public User createUser(double rn) {
        if (rn < 0.75) {
            return new Student() ;
        }
        else {
            return new Teacher();
        }
    }
    
    public ArrayList<User>  createUsers(int num_of_users) {
        ArrayList<User> usersArray= new ArrayList<User>();
         for (int i = 0; i < num_of_users; i++) {
        double rn = Math.random() ;
        usersArray.add(createUser(rn));
    }
         return usersArray;
    }

    
}
