# Only Draw When we Drag the Mouse

Dragging the mouse means the user is holding down the left mouse button and is moving the mouse across the canvas. Our drawing library has a built-in **boolean** value we can use: `mouseInfo.isMouseDragged()`.

Let's use this value as the condition for an if-statement that controls whether our line is drawn or not.

## Follow Along

Write this if-statement directly above the section in our `update` method responsible for drawing the line, and make sure the following curly brackets `{ }` surround both drawing the line and updating the last mouse coordinates:

```java
  ...

  //+ Add this if-statement and condition. Note the open {
  if (mouseInfo.isMouseDragged()) {

    paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), lastMouseX, lastMouseY);

    lastMouseX = mouseInfo.getX();
    lastMouseY = mouseInfo.getY();
  }
  //+ Add a closing } above here
}
```

## Run the Program

You should now see that we only draw lines while we drag the mouse!

In programming, we think of this using the language of "IF this THEN that". So what we wrote is "IF we are dragging the mouse, THEN draw a line to the mouse and update the last coordinates".
