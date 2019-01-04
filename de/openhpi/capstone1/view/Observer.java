package de.openhpi.capstone1.view;


import de.openhpi.capstone1.model.Subject;
import processing.core.PApplet;


public abstract class Observer {
    protected PApplet display;

    public Observer( PApplet display){
        this.display = display;
    }

    public abstract void update(Object value);

}
