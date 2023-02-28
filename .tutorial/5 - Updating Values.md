# Updating Values

So we've created a spot in memory which we intend to use to store the previous mouse position from the last frame. We can use the `=` operator to set a value to our variables, and if we do so at the end of the `update` method, we'll be able to store the position of the mouse cursor at the end of the frame.

At the bottom of the `update()` method set the value of each variable to the mouse's position:

```java
  ...

  public void update() {
    paint.setLineColor(
      Generator.randomInt(256),
      Generator.randomInt(256),
      Generator.randomInt(256)
    );

    paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), screen.getWidth() / 2, screen.getHeight() / 2);
      
    //+ Update the last location values of the mouse
    lastMouseX = mouseInfo.getX();
    lastMouseY = mouseInfo.getY();
    //
  }
}
```
