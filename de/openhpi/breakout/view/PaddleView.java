package de.openhpi.breakout.view;


import de.openhpi.breakout.model.Paddle;
import processing.core.PApplet;


public class PaddleView extends Observer {
    Paddle myPaddle;

    public PaddleView ( PApplet display) {
        super(display);
        myPaddle = new Paddle();
        update(0);
    }

    public Paddle getPaddle() {
        return myPaddle;
    }

    public void update (int mouseX){
        myPaddle.setxPosition( mouseX - (myPaddle.getPaddleWidth() / 2));
        display.fill(120, 50, 240);
        display.rect( myPaddle.getxPosition() , myPaddle.getyPosition(), myPaddle.getPaddleWidth(),
                      myPaddle.getPaddleHeight() );
        display.redraw();

    }

}
