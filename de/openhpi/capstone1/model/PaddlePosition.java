package de.openhpi.capstone1.model;


public class PaddlePosition {
    private double xPostion = 0;
    private double speed = 0.5;

    public double getXPostion () {
        return xPostion;
    }

    public void updateXPostion(PaddleDirection direction) {
        System.out.println( direction );
    }

}
