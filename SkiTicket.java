package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public class SkiTicket {
    protected Type type;
    protected CountOfTripsStrategy count;
    protected WithoutCounting withoutC;
    protected int id = 0;
    public SkiTicket(){
    }
    public String typeOfTicket(){
        String a = "";
        switch (type){
            case WEEKDAY: a = "Weekday"; break;
            case WEEKEND: a = "Weekend"; break;
            case MONTH: a = "Month"; break;
        }
        return a;
    }

    public int times(){
        int time = 0;
        switch (count){
            case TEN: time = 10; break;
            case TWENTY: time = 20; break;
            case FIFTY: time = 50; break;
            case HUNDRED: time = 100; break;
            case WITHOUT: time = 0;break;
        }return time;
    }

    public int days(){
        int days = 0;
        switch (withoutC){
            case TWO: days = 2;break;
            case ONE: days = 1; break;
            case FIVE: days = 5; break;
        }
        return days;
    }

    public int idManager(){
        id = id+1;
        return this.id = id;
    }

    public String toString(){
        return "ID: " + this.idManager() + ", type: " + this.typeOfTicket();
    }

}
