package de.openhpi.capstone1.view;


import processing.core.PApplet;


public class PaddleView extends Observer {

    public int xPosition = 1;
    private int speed = 10;
    private int maxXPosition = 500 - 100;

    public PaddleView ( PApplet display) {
        super(display);
        update(0);
    }

    @Override
    public void update(Object direction){

        //boolean blubb = (boolean) direction;

        // ToDo: if paddle on 0 or maxXPosition then change the direction
        int xDirection = (int) direction;

        if(xDirection == 1 && xPosition <= maxXPosition) {
            this.xPosition = xPosition + speed;
        }else if (xDirection == 0 && xPosition >= 0) {
            this.xPosition = xPosition - speed;
        }

        display.fill(120, 50, 240);
        display.rect( xPosition , 450,100, 15 );
        display.redraw();

    }

}
