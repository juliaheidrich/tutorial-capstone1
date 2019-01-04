package de.openhpi.capstone1.view;


import de.openhpi.capstone1.model.Counter;
import processing.core.PApplet;


public class CounterViewColor extends Observer {
    public CounterViewColor( PApplet display) {
        super(display);
        update(0);
    }

    public void update(Object value){
        try{
            int[] colors = new int[3];

            int v = (int) value;

            colors[0] = (v * 10) % 255;
            colors[1] = (v * 5) % 255;
            colors[2] = (v * 20) % 255;

            display.fill(colors[0], colors[1], colors[2]);
            display.rect(1, 1, 10, 10);
            display.redraw();
        } catch (ClassCastException error){
            System.out.println( error.getMessage() );
        }



    }
}
