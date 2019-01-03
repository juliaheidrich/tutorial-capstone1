package de.openhpi.capstone1.starter;


import de.openhpi.capstone1.controller.CounterController;
import de.openhpi.capstone1.model.Counter;
import processing.core.PApplet;


public class BuildApplication extends PApplet {

    private CounterController counterController;
    private Counter counter;

    @Override
    public void settings(){
        size(500,500);
    }

    @Override
    public void setup(){
        frameRate(30);
        fill(120, 50, 240);
        rect(10, 40, 100, 100);

        counter = new Counter();
        counterController = new CounterController( counter );
        counterV
    }

    @Override
    public void draw(){
    }
}
