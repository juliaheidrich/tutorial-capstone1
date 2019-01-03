package de.openhpi.capstone1.starter;


import de.openhpi.capstone1.controller.CounterController;
import de.openhpi.capstone1.model.Counter;
import de.openhpi.capstone1.view.CounterView;
import de.openhpi.capstone1.view.Observer;
import processing.core.PApplet;


public class BuildApplication extends PApplet {

    private Observer counterView;
    private CounterController counterController;
    private Counter counter;

    @Override
    public void settings(){
        size(500,500);
    }

    @Override
    public void setup(){
        frameRate(30);
        counter = new Counter();
        counterController = new CounterController( counter );
        counterView = new CounterView( this, counter );

        /*fill(120, 50, 240);
        rect(10, 40, 100, 100);
        */

        System.out.println(counter.getCount());

    }

    @Override
    public void draw(){}

    @Override
    public void mouseClicked() {
        counterController.handleEvent();
    }
}
