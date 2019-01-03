package de.openhpi.capstone1.view;


import de.openhpi.capstone1.model.Counter;
import processing.core.PApplet;


public class CounterView extends Observer {
    Counter counter;

    public CounterView( PApplet display, Counter subject ) {
        super(display, subject);
        this.counter = subject;
        update();
    }

    @Override
    public void update(){
        display.background(204);
        display.fill(120, 50, 240);
        display.rect(counter.getCount() +1, 40, 100, 100);
        display.redraw();

    }
}
