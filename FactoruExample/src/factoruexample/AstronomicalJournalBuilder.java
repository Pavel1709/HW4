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
public class AstronomicalJournalBuilder extends JournalBuilder{

protected final int yearBegin = 1964;
public AstronomicalJournalBuilder() {
    yearCurrent=yearBegin;
}

   

    @Override
    public void createJName() {
     this.journal.setName("Сквозь терни к звездам");
    }

    @Override
    public void createJVolume() {
 this.journal.setVolume(volumeCounter);
      tickCounter();
    }

    @Override
    public void createJYear() {
this.journal.setYear(yearCurrent);
    }
    @Override
    protected void tickCounter() {
        this.volumeCounter++;
        if (this.volumeCounter > 12) {
            this.volumeCounter = 1;
        }
        yearCurrent ++ ;
    }
}
