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
public class JournalDirector {
    private JournalBuilder JB;

    public JournalBuilder getJB() {
        return JB;
    }

    public void setJB(JournalBuilder JB) {
        this.JB = JB;
    }
    
    public Journal getJournal() {
        return JB.getJournal();
    }
    
    public void createJournal() {
        JB.createJournal();
        JB.createJName();
        JB.createJVolume();
        JB.createJYear();
    }
    
    
    public boolean isJournalsIsOver() {
        return JB.isOver();
    }
    
   
}
