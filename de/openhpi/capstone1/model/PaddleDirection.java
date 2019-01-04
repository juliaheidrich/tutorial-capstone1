package de.openhpi.capstone1.model;


public class PaddleDirection {
    private int direction = 1;
    // Direction 1 = true
    // Direction 0 = false

    public int getDirection(){
        return direction;
    }

    public void updateDirection() {
        //this.direction = direction;
        System.out.println( this.direction );
    }

}
