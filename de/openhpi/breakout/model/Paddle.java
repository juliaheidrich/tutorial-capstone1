package de.openhpi.breakout.model;


public class Paddle {

    public int xPosition;
    public int yPosition;
    public int paddleHeight;
    public int paddleWidth;

    public Paddle(){
        xPosition = 0;
        yPosition = 485;
        paddleHeight = 15;
        paddleWidth = 100;
    }

    public int getxPosition() {
        return xPosition;
    }
    public void setxPosition( int xPosition ) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int getPaddleHeight() {
        return paddleHeight;
    }

    public int getPaddleWidth() {
        return paddleWidth;
    }

}
