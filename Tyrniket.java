package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public class Tyrniket {
    private int defaultSize = 10;

    private int insertIndex = 0;
    protected SkiTicket [] reestation = new SkiTicket[defaultSize];

    public void addTicket(SkiTicket skiTicket){
        checkSize();
        reestation[insertIndex] = skiTicket;
        insertIndex++;
    }

    private void checkSize() {
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            SkiTicket[] b = new SkiTicket[defaultSize];
            for (int i = 0; i <= insertIndex; i++) {
                b[i] = reestation[i];
            }
            reestation = b;
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i++) {
            s += reestation[i].toString() + "\n";
        }
        return s;
    }

    public String check(int indexOfCard){
        SkiTicket thisCardToCheck = reestation[indexOfCard];
        String cheking;
        if(thisCardToCheck.times() != 0){
            Oblik obl = new OblikDecorator().getTimesLeft();
             cheking = "Allowed.Checked, -1 time";
        }
        if(thisCardToCheck.days() != 1){
            Oblik obl = new OblikDecorator().getDaysLeft();
             cheking = "Allowed.Checked, -1 day";
        }
        else{
             cheking = "It's your last time. Next time you will be blocked";
        }
        return cheking;
    }
}
