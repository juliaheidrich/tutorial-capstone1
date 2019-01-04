package de.openhpi.capstone1.starter;


import java.io.File;

import com.sun.java.util.jar.pack.PackerImpl;
import de.openhpi.capstone1.controller.CounterController;
import de.openhpi.capstone1.model.Counter;
import de.openhpi.capstone1.view.BallView;
import de.openhpi.capstone1.view.CounterView;
import de.openhpi.capstone1.view.CounterViewColor;
import de.openhpi.capstone1.view.CounterViewNumber;
import de.openhpi.capstone1.view.Observer;
import de.openhpi.capstone1.view.PaddleView;
import processing.core.PApplet;
import processing.core.PImage;


public class BuildApplication extends PApplet {

    private Observer counterView;
    private Observer counterViewColor;
    private Observer counterViewNumber;
    private CounterController counterController;
    private PaddleView paddleView;
    private BallView ballView;
    private Counter counter;
    private int direction = 1;
    private boolean arrowKeyPressed = false;
    private int paddleSpeed = 0;

    private PImage background;

    @Override
    public void settings(){

        size(500,500);
        smooth();
    }

    @Override
    public void setup(){
        frameRate(30);
        counter = new Counter();
        counterController = new CounterController( counter );
        paddleView = new PaddleView( this );
        ballView = new BallView( this );
        //counterView = new CounterView( this );
        //counterViewColor = new CounterViewColor( this);
        //counterViewNumber = new CounterViewNumber( this);
        /*fill(120, 50, 240);
        rect(10, 40, 100, 100);
        */

        System.out.println(counter.getCount());
        System.out.println( new File( ".").getAbsolutePath() );
        background = loadImage("de/openhpi/capstone1/view/brickbreakerUniverseBackground.jpg");
    }

    @Override
    public void draw(){
        // needed even if its empty when using click events
        int count = counter.getCount();
        background(background);
        fill( 255 );
        //rect(random( 100 ), random( 100 ), 10,10  );
        //counterView.update( count );
        //counterViewColor.update( count );
        //counterViewNumber.update( count );
        //System.out.println( direction );

        /*if(keyPressed) {
            if (key == CODED) {
                if (keyCode == LEFT) {
                    direction = 0;
                    System.out.println( " <- Pressed Left Key [DirectionCode: 0] "  );
                } else if (keyCode == RIGHT) {
                    direction = 1;
                    System.out.println( " -> Pressed Right Key [DirectionCode: 1]" );
                }
                paddleSpeed = 20;
            } else {
                System.out.println( "NoCodedKey Pressed" );
                paddleSpeed = 0;
            }
        }else {
            paddleSpeed = 0;
        }*/

        //paddleView.update(paddleSpeed, direction);

        paddleView.update(mouseX);
        ballView.update( count );
        ballView.display( );
        ballView.checkBoundaryCollision();
        ballView.checkPaddleCollision( paddleView );

    }

    @Override
    public void mouseClicked() {
        background(background);
        counterController.handleEvent();
    }

}
