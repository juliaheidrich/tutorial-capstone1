package de.openhpi.capstone1.view;


import processing.core.PApplet;


public class PaddleView extends Observer {

    public int xPosition = 0;
    public int yPosition = 485;
    public int paddleHeight = 15;
    public int paddleWidth = 100;
    private int paddleSpeed = 20;
    private int maxXPosition = 500 - 100;

    public PaddleView ( PApplet display) {
        super(display);
        update(0);
    }

    /*public void update(int paddleSpeed, Object direction){

        //if(arrowKeyPressed) {
            int xDirection = (int) direction;

            if(xDirection == 1 && xPosition <= maxXPosition) {
                this.xPosition = xPosition + paddleSpeed;
            }else if (xDirection == 0 && xPosition >= 0) {
                this.xPosition = xPosition - paddleSpeed;
            }

            display.fill(120, 50, 240);
            display.rect( xPosition , yPosition, paddleWidth, paddleHeight );
            display.redraw();
        //}else {
            //  display.fill(120, 50, 240);
            //display.rect( xPosition , yPosition, paddleWidth, paddleHeight );
            // display.redraw();
        //}


    }*/

    public void update (int mouseX){
        xPosition =  mouseX - (paddleWidth / 2);
        display.fill(120, 50, 240);
        display.rect( xPosition , yPosition, paddleWidth, paddleHeight );
        display.redraw();

    }

}
