package de.openhpi.capstone1.controller;


import de.openhpi.capstone1.model.PaddleDirection;


public class PaddleController {
    PaddleDirection direction;

    public PaddleController(PaddleDirection direction){
        this.direction = direction;
    }

    public void handleEvent() {
        direction.updateDirection( );
        System.out.println( this.direction );
    }


}
