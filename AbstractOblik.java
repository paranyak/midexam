package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
abstract class AbstractOblik implements Oblik {
    protected Oblik obl;
    public AbstractOblik(Oblik obl){
        this.obl = obl;
    }
}
