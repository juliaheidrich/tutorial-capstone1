package de.openhpi.capstone1.view;


import de.openhpi.capstone1.model.Counter;
import processing.core.PApplet;


public class CounterViewNumber extends Observer {

    public CounterViewNumber( PApplet display){
        super(display);
        update( "0" );
    }

    public void update(Object value) {
        try {
            display.fill(0);
            display.text(value + "", 1, 30);
            display.redraw();
        }catch(ClassCastException error){
            System.out.println( error.getMessage() );
        }
    }
}
