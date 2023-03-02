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
        for (int circleNumber = 1;circleNumber <= 400;circleNumber++){
          drawRandomCircle();
        }
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

    }
  public void drawRandomCircle(){
    int r = Generator.randomInt(256);
    int g = Generator.randomInt(256);
    int b = Generator.randomInt(256);
      
    paint.setFillColor(r, g, b);
    int x = Generator.randomInt(600);
    int y = Generator.randomInt(400);
    int radius = Generator.randomInt(10, 30);
    paint.drawCircle(x,y,radius);
  }
}
