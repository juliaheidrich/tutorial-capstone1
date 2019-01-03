package de.openhpi.capstone1.starter;

import processing.core.PApplet;

public class Main {
    public static void main(String args[]){
        PApplet.main( new String[]{ BuildApplication.class.getName()} );
        //To start the program in fullscreen mode, use this
        //PApplet.main(new String[]{"--present",BuildApplication.class.getName()});
    }
}
