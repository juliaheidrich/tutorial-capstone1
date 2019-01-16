package de.openhpi.breakout.view;

import de.openhpi.breakout.model.Ball;
import processing.core.PApplet;


public class BallView extends Observer {

    Ball myBall;

    public BallView( PApplet display ) {
        super( display );
        myBall = new Ball();
        update();
    }

    public Ball getBall() {
        return myBall;
    }

    public void update( ) {
        myBall.setBallPosition( myBall.getBallPosition().add( myBall.getVelocity() ) );
    }

    public void display() {
        display.noStroke();
        display.fill( 255 );
        display.ellipse( myBall.getBallPosition().x, myBall.getBallPosition().y, myBall.getBallRadius() * 2, myBall.getBallRadius() * 2 );
    }

}
