package de.openhpi.breakout.starter;

import de.openhpi.breakout.controller.CollisionController;
import de.openhpi.breakout.view.BallView;
import de.openhpi.breakout.view.PaddleView;
import processing.core.PApplet;
import processing.core.PImage;


public class BuildApplication extends PApplet {

    private PaddleView paddleView;
    private BallView ballView;
    private CollisionController collisionController;


    private PImage background;

    @Override
    public void settings(){

        size(500,500);
        smooth();
    }

    @Override
    public void setup(){
        frameRate(30);
        paddleView = new PaddleView( this );
        ballView = new BallView( this );
        collisionController = new CollisionController( ballView.getBall(), paddleView.getPaddle(),500, 500);

        background = loadImage( "de/openhpi/breakout/view/images/brickbreakerUniverseBackground.jpg" );
    }

    @Override
    public void draw(){
        // needed even if its empty when using click events
        background(background);
        fill( 255 );

        paddleView.update(mouseX);
        ballView.update(  );
        ballView.display();
        collisionController.checkBoundaryCollision();
        collisionController.checkPaddleCollision();

    }

    @Override
    public void mouseClicked() {
        background(background);
    }

}
