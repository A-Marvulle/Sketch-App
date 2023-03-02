package tools;

import sketchpad.Main;

public class PaintingTool {

    private final Main applet = Main.applet;

    public void drawText(String str, int x, int y) {
        applet.text(str, x, y);
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        applet.line(x1, y1, x2, y2);
    }

    public void setLineThickness(int thickness) {
        applet.strokeWeight(thickness);
    }

    public void setLineColor(Color c) {
        applet.stroke(c);
    }

    public void setLineColor(int red, int green, int blue) {
        applet.stroke(red, green, blue);
    }

    public void drawRect(int leftX, int topY, int width, int height) {
        applet.rect(leftX, topY, width, height);
    }

    public void drawCircle(int centerX, int centerY, int radius) {
        applet.ellipse(centerX, centerY, 2 * radius, 2 * radius);
    }

    public void setFillColor(Color c) {
        applet.fill(c.getRed(), c.getGreen(), c.getBlue());
    }

    public void setFillColor(int red, int green, int blue) {
        applet.fill(red, green, blue);
    }

}
