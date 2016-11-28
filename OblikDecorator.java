package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public class OblikDecorator extends AbstractOblik {

    protected  SkiTicket sk;

    public OblikDecorator(Oblik obl){
        super(obl);
    }
    @Override
    public int getTimesLeft() {
        return sk.times() -1;
    }

    @Override
    public int getDaysLeft() {
        return sk.days();
    }
}
