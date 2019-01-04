package de.openhpi.capstone1.model;

public class Counter {

    private int count = 0;

    public int getCount(){
        return count;
    }

    public void updateCount( ) {
        this.count++;
    }

}
