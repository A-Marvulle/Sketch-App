package sketchpad;

import processing.core.PApplet;
import tools.Color;

public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main("sketchpad.Main");
    }


    /* Additional code below should not be modified */













































    /* Utilities to Interact with the Processing Library */

    public static Main applet;

    private SketchPad sketchPad;
    private boolean mousePressed;
    private boolean mouseDragged;

    public void settings() {
        applet = this;
        size(600, 400);

        sketchPad = new SketchPad();
    }

    public void setup() {
        colorMode(RGB, 255, 255, 255);
        sketchPad.initialLaunch();
    }

    public void draw() {
        sketchPad.update();
        resetValues();
    }

    public void resetValues() {
        mouseDragged = false;
        mousePressed = false;
    }

    public void background(Color c) {
        super.background(c.getRed(), c.getGreen(), c.getBlue());
    }

    @Override
    public void mousePressed() {
        mousePressed = true;
    }

    @Override
    public void mouseDragged() {
        mouseDragged = true;
    }

    public boolean isMousePressed() {
        return mousePressed;
    }

    public boolean isMouseDragged() {
        return mouseDragged;
    }

    public void stroke(Color c) {
        super.stroke(c.getRed(), c.getGreen(), c.getBlue());
    }
}
