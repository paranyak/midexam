package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public enum  CountOfTripsStrategy {
    TEN, TWENTY, FIFTY, HUNDRED, WITHOUT;
    public String toString(){
        String a = "";
        switch (this){
            case TEN: a = "Ten"; break;
            case TWENTY: a = "Twenty"; break;
            case FIFTY: a = "Fifty"; break;
            case HUNDRED: a = "Hundred times"; break;
            case WITHOUT: a = "Without"; break;

    }
    return a;
}}
