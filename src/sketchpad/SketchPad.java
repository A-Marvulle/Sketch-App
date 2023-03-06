package sketchpad;

import buttons.*;
import tools.*;

public class SketchPad {
    private final Screen screen = new Screen();
    private final MouseInfo mouseInfo = new MouseInfo();
    private final PaintingTool paint = new PaintingTool();

    // Declaring variables to represent the last location of the mouse
    private int lastMouseX;
    private int lastMouseY;

    private ClearButton clearButton = new ClearButton(5,5,20,Color.WHITE);

    public void initialLaunch() {
        // The background color
        screen.setBackgroundColor(Color.CYAN);

        // Generate many random circles for a colorful backdground
        for (int circleNumber = 0; circleNumber < 500; circleNumber++) {
            drawRandomCircle();
        }

        // The interior sketch surface
        paint.setFillColor(Color.WHITE);
        paint.drawRect(30, 30, 540, 340);

        clearButton.drawSelf();
    }

    public void update() {
        // Setting the pen color to a random number
        paint.setLineColor(
               Generator.randomInt(256),
               Generator.randomInt(256),
               Generator.randomInt(256)
        );
        
        // If the mouse was just clicked, update the last mouse location data
        if (mouseInfo.isMousePressed()) {
            lastMouseX = mouseInfo.getX();
            lastMouseY = mouseInfo.getY();
        }

        // Only draw lines if the mouse was dragged and inside the interior sketch surface
        if (mouseInfo.isMouseDragged() &&
            mouseInfo.getX() >= 30 &&
            mouseInfo.getX() <= 570 &&
            mouseInfo.getY() >= 30 &&
            mouseInfo.getY() <= 370) {

            paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), lastMouseX, lastMouseY);
            lastMouseX = mouseInfo.getX();
            lastMouseY = mouseInfo.getY();
        }
        clearButton.update();

    }

    public void drawRandomCircle() {
        int x = Generator.randomInt(600);
        int y = Generator.randomInt(400);
        int radius = Generator.randomInt(10, 30);
        int r = Generator.randomInt(255);
        int g = Generator.randomInt(255);
        int b = Generator.randomInt(255);
        paint.setFillColor(r, g, b);
        paint.drawCircle(x, y, radius);
    }
}
