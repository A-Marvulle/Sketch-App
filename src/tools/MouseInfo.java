package tools;

import sketchpad.Main;

public class MouseInfo {
    private final Main applet = Main.applet;

    public int getX() {
        return applet.mouseX;
    }

    public int getY() {
        return applet.mouseY;
    }

    public boolean isMousePressed() {
        return applet.isMousePressed();
    }

    public boolean isMouseDragged() {
        return applet.isMouseDragged();
    }
}
