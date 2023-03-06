package buttons;

import tools.Color;
import tools.MouseInfo;
import tools.PaintingTool;

public abstract class SquareButton {
    private final MouseInfo mouseInfo = new MouseInfo();
    private final PaintingTool paint = new PaintingTool();

    private final int leftX;
    private final int topY;
    private final int size;
    private final Color color;

    public SquareButton(int incomingX, int incomingY, int incomingSize, Color incomingColor) {
        leftX = incomingX;
        topY = incomingY;
        size = incomingSize;
        color = incomingColor;
    }

    public void update() {
        if (isPressed()) {
            performAction();
        }
    }

    public void drawSelf() {
        paint.setLineColor(Color.BLACK);
        paint.setFillColor(color);
        paint.drawRect(leftX, topY, size, size);
    }

    public boolean isPressed() {
        return mouseInfo.isMousePressed() &&
                mouseInfo.getX() >= leftX &&
                mouseInfo.getX() <= leftX + size &&
                mouseInfo.getY() >= topY &&
                mouseInfo.getY() <= topY + size;
    }

    public abstract void performAction();

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
