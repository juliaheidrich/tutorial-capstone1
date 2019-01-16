package de.openhpi.breakout.controller;


import de.openhpi.breakout.model.Ball;
import de.openhpi.breakout.model.Paddle;

public class CollisionController {

    Ball theBall;
    Paddle thePaddle;
    int stageX;
    int stageY;

    public CollisionController( Ball theBall, Paddle thePaddle, int stageX, int stageY ) {
        this.theBall = theBall;
        this.thePaddle = thePaddle;
        this.stageX = stageX;
        this.stageY = stageY;
    }

    public void checkBoundaryCollision() {
        if( theBall.getBallPosition().x > (stageX - theBall.getBallRadius()) ) {
            theBall.getBallPosition().x = stageX - theBall.getBallRadius();
            theBall.getVelocity().x *= -1;
        }
        else if( theBall.getBallPosition().x < theBall.getBallRadius() ) {
            theBall.getBallPosition().x = theBall.getBallRadius();
            theBall.getVelocity().x *= -1;
        }
        else if( theBall.getBallPosition().y > (stageY - theBall.getBallRadius()) ) {
            //myBall.setBallPosition( myBall.getBallPosition().y );

            theBall.getBallPosition().y++;
            //velocity.y *= -1;
        }
        else if( theBall.getBallPosition().y < theBall.getBallRadius() ) {
            theBall.getBallPosition().y = theBall.getBallRadius();
            theBall.getVelocity().y *= -1;
        }
    }

    public void checkPaddleCollision() {

        if( theBall.getBallPosition().x > (thePaddle.getxPosition() - (theBall.getBallRadius()))
                    && theBall.getBallPosition().x < ((thePaddle.getxPosition() + thePaddle.getPaddleWidth()) - (theBall.getBallRadius()))
                    && theBall.getBallPosition().y > thePaddle.yPosition - theBall.getBallRadius() ) {

            // if the ball was not already fallen from stage
            if( theBall.getBallPosition().y < 500 - theBall.getBallRadius() ) {
                theBall.getBallPosition().y = thePaddle.yPosition -  theBall.getBallRadius();
                theBall.getVelocity().y *= -1;
            }
        }

    }

}
