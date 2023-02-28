package sketchpad;

import buttons.*;
import tools.*;

public class SketchPad {
    private final Screen screen = new Screen();
    private final MouseInfo mouseInfo = new MouseInfo();
    private final PaintingTool paint = new PaintingTool();

    //+ Declare variables for the previous mouse coordinates
  private int lastMouseX;
  private int lastMouseY;

    //

    public void initialLaunch() {
        // The background color
        screen.setBackgroundColor(Color.CYAN);

        // The interior sketch surface
        paint.setFillColor(Color.WHITE);
        paint.drawRect(30, 30, 540, 340);
    }

    public void update() {
        // Setting the pen color to a random number
        paint.setLineColor(
               tools.Generator.randomInt(256),
               tools.Generator.randomInt(256),
               tools.Generator.randomInt(256)
        );
        
        // Drawing a line from the current mouse location to the center of the screen
        paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), lastMouseX, lastMouseY);

        //+ Update the last location values of the mouse
        lastMouseX = mouseInfo.getX();
        lastMouseY = mouseInfo.getY();
        //
    }
}
