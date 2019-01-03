package de.openhpi.capstone1.controller;

import de.openhpi.capstone1.model.Counter;

public class CounterController {
    Counter counter;

    public CounterController(Counter counter) {
        this.counter = counter;
    }

    public void handleEvent() {
        counter.setCount( counter.getCount() +1 );
        System.out.println( counter.getCount() );

    }

}
