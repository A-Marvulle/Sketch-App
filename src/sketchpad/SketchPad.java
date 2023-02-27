package sketchpad;

import buttons.*;
import tools.*;

public class SketchPad {
    private final Screen screen = new Screen();
    private final MouseInfo mouseInfo = new MouseInfo();
    private final PaintingTool paint = new PaintingTool();

    public void initialLaunch() {
      screen.setBackgroundColor(Color.PURPLE);
     /* paint.setFillColor(Color.GREEN);
      paint.drawCircle(100, 200, 50);*/

      //one circle in each corner
      paint.setFillColor(Color.RED);
      paint.drawCircle(0, 0, 20);
      
      paint.setFillColor(Color.GREEN);
      paint.drawCircle(600, 0, 20);
      
      paint.setFillColor(Color.BLUE);
      paint.drawCircle(0, 400, 20);
      
      paint.setFillColor(Color.MAGENTA);
      paint.drawCircle(600, 400, 20);

      paint.setFillColor(Color.WHITE);
      paint.drawRect(30, 30, 540, 340);
      
      

    }

    public void update() {

    }
}
