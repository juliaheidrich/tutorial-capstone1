package de.openhpi.breakout.view;


import processing.core.PApplet;


public abstract class Observer {
    protected PApplet display;

    public Observer( PApplet display){
        this.display = display;
    }

    //public abstract void update(Object value);

}
