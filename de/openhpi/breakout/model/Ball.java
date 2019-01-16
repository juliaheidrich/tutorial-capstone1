package de.openhpi.breakout.model;


import java.util.Random;

import processing.core.PVector;


public class Ball {
    PVector ballPosition;
    PVector velocity;
    float ballRadius;

    public Ball() {
        velocity = new PVector( getRandomNumberInRange(5,20), getRandomNumberInRange(5,20));
        ballRadius = 10;
        ballPosition = new PVector( 30, 40 );
    }

    public PVector getBallPosition() {
        return ballPosition;
    }

    public void setBallPosition( PVector ballPosition ) {
        this.ballPosition = ballPosition;
    }

    public PVector getVelocity() {
        return velocity;
    }

    public float getBallRadius() {
        return ballRadius;
    }

    private static int getRandomNumberInRange( int min, int max ) {

        if( min >= max ) {
            throw new IllegalArgumentException( "max must be greater than min" );
        }

        Random r = new Random();
        int returningNumber = r.nextInt( (max - min) + 1 ) + min;
        System.out.println( "Created random Number " + returningNumber);
        return returningNumber;


    }

}
