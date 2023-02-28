# Accessing Values: Finishing our Pen

We can now reference our variables inside of a `drawLine` method, and it will read their values as coordinates for the line.

Inside of our `update` method, above the section where we set the last mouse position, but after we set the line color, change the `drawLine` method call to use the mouse's current position and it's previous position:

```java
public void update() {

    paint.setLineColor(
      Generator.randomInt(256),
      Generator.randomInt(256),
      Generator.randomInt(256)
    );

    //+ Use the current and last locations of the mouse to draw the lines
    paint.drawLine(mouseInfo.getX(), mouseInfo.getY(), lastMouseX, lastMouseY);
    //

    lastMouseX = mouseInfo.getX();
    lastMouseY = mouseInfo.getY();
}
```

Notice when using the variables, `lastMouseX` and `lastMouseY`, we simply type the variable names. They are not methods, so we do not add `()`. They have already been declared, so we do not add the `int` again.

<details>
<summary>Code Execution Order</summary>
Note that it's very important we write these commands in this order.

All code is executed sequentially from top to bottom. (Even though it all happens so fast it can seem to us like it happens at once).

We need to use the last mouse positions before updating them. So that by the time they are used again, their value is from the previous iteration of the `update` method.

If this sounds confusing, consider what would happen if we recorded the values for the last mouse positions right *before* using them. The mouse's current and last positions would have the same value and our line would be a single point which we wouldn't even be able to see!
</details>
<br>