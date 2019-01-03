package de.openhpi.capstone1.model;


import java.util.ArrayList;
import java.util.List;

import de.openhpi.capstone1.view.Observer;


public class Counter implements Subject {

    private int count = 0;
    private List<Observer> observers = new ArrayList<Observer>();

    public int getCount(){
        return count;
    }

    public void setCount(int count ) {
        this.count = count;
        notifyAllObservers();
    }

    @Override
    public void attach( Observer observer ) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
