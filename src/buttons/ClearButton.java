 package buttons;

import tools.Color;
import tools.MouseInfo;
import tools.PaintingTool;

public class ClearButton {
    private MouseInfo mouseInfo = new MouseInfo();
    private PaintingTool paint = new PaintingTool();

    private int leftX;
    private int topY;
    private int size;
    private Color color;

    public ClearButton(int incomingX, int incomingY, int incomingSize, Color incomingColor) {
      leftX = incomingX;
      topY = incomingY;
      size = incomingSize;
      color = incomingColor;
    }

    public void drawSelf() {
      paint.setLineColor(Color.BLACK);
      paint.setFillColor(color);
      paint.drawRect(leftX, topY, size, size);
      
      paint.setLineColor(Color.RED);
      paint.drawLine(leftX, topY, leftX + size, topY + size);

    }

    public boolean isPressed() {
        return mouseInfo.isMousePressed() &&
                mouseInfo.getX() >= leftX &&
                mouseInfo.getX() <= leftX + size &&
                mouseInfo.getY() >= topY &&
                mouseInfo.getY() <= topY + size;
    }
  
    public void update() {
        if (isPressed()) {
            performAction();
        }
    }


    public void performAction() {
      paint.setFillColor(Color.WHITE);
      paint.drawRect(30, 30, 540, 340);
    }

  
    //Getters
    public Color getColor() {
        return color;
    }

    public int getLeftX() {
        return leftX;
    }

    public int getTopY() {
        return topY;
    }

    public int getSize() {
        return size;
    }
}
