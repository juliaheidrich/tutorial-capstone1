package de.openhpi.capstone1.view;


import de.openhpi.capstone1.model.Counter;
import processing.core.PApplet;


public class CounterView extends Observer {

    public CounterView( PApplet display) {
        super(display);
        update(0);
    }

    @Override
    public void update(Object value){
        try{
            int x = (int) value;

            display.fill(120, 50, 240);
            display.rect(x +1, 40, 100, 100);
            display.redraw();
        } catch (ClassCastException error){
            System.out.println( error.getMessage() );
        }



    }
}
