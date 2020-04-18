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
abstract public class JournalBuilder {
    protected Journal journal;
    protected int volumeCounter;
   
    protected int yearCurrent;
    public Journal getJournal() {
        return journal;
    }

    public  void createJournal() {
        this.journal = new Journal();
    }
    
    public void createJVolume() {
      this.journal.setVolume(volumeCounter);
      tickCounter();
    }
     
    public void createJYear() {
      this.journal.setYear(yearCurrent);
      
    }
    
    public abstract void createJName();      
   // public abstract void createJVolume();
    
    protected abstract void tickCounter();
   
    
    boolean isOver() {
        return yearCurrent > 2020;
    }
}
