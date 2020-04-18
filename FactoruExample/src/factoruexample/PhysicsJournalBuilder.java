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
public class PhysicsJournalBuilder extends JournalBuilder{

protected final int yearBegin = 1964;
public PhysicsJournalBuilder() {
    yearCurrent=yearBegin;
}

  
 

    @Override
    public void createJName() {
      this.journal.setName("Юные физики");
    }

   
    

   
    @Override
    public void tickCounter() {
        this.volumeCounter++;
        if (this.volumeCounter > 12) {
            this.volumeCounter = 1;
        }
        yearCurrent ++ ;
    }
}
