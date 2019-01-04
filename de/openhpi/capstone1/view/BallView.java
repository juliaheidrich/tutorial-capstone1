package de.openhpi.capstone1.view;


import processing.core.PApplet;
import processing.core.PVector;


public class BallView extends Observer {

    PVector ballPosition;
    PVector velocity;

    float ballRadius;

    public BallView ( PApplet display ) {
        super(display);
        ballPosition = new PVector( 30, 40);
        velocity = new PVector( 2,5 );
        ballRadius = 20;
        update(10);
    }

    @Override
    public void update(Object value) {

        int x = (int) value;
        ballPosition.add( velocity );
        //display.ellipse(x,46,25,25);
    }

    public void display() {
        display.noStroke();
        display.fill(0);
        display.ellipse( ballPosition.x, ballPosition.y, ballRadius *2, ballRadius *2 );
    }

    public void checkBoundaryCollision() {
        if( ballPosition.x > (500 - ballRadius) ) {
            ballPosition.x = 500 - ballRadius;
            velocity.x *= -1;
        } else if( ballPosition.x < ballRadius ) {
            ballPosition.x = ballRadius;
            velocity.x *= -1;
        } else if ( ballPosition.y > (500 - ballRadius) ) {
            ballPosition.y ++;
            //velocity.y *= -1;
        } else if ( ballPosition.y < ballRadius ) {
            ballPosition.y = ballRadius;
            velocity.y *= -1;
        }
    }

    public void checkPaddleCollision(PaddleView paddle) {
        System.out.println( paddle.xPosition );

        if(ballPosition.x > (paddle.xPosition - (ballRadius))
        && ballPosition.x < ((paddle.xPosition + paddle.paddleWidth) -(ballRadius))
        && ballPosition.y > paddle.yPosition - ballRadius) {

            // if the ball was not already fallen from stage
            if(ballPosition.y < 500 - ballRadius) {
                ballPosition.y = paddle.yPosition - ballRadius;
                velocity.y *= -1;
            }
        }

    }
}
