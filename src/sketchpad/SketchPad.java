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
               Generator.randomInt(256),
               Generator.randomInt(256),
               Generator.randomInt(256)
        );
        if(mouseInfo.isMousePressed()){
          lastMouseX = mouseInfo.getX();
          lastMouseY = mouseInfo.getY();
        }
        // Drawing a line from the current mouse location to the last mouse location
      if(mouseInfo.isMouseDragged() && 
         mouseInfo.getX() > 30 &&
         mouseInfo.getY() > 30 && 
         mouseInfo.getX() < 570 &&
         mouseInfo.getY() < 370 ){  
      
        paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), lastMouseX, lastMouseY);
        lastMouseX = mouseInfo.getX();
        lastMouseY = mouseInfo.getY();
      }

        // Updating the variables of the last mouse location
        

    }
}
