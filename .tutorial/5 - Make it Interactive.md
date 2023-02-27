# Make it Interactive

Let's take advantage of the `update` method to add interactivity to the program. Instead of drawing a line from one fixed-location on the screen to another, we will set the end point of our line to the mouse coordinates.

But how can we get the x and y position of the user's mouse?

## Method Return Values

We mentioned earlier that some methods don't just perform an action, but actually provide data back to us when we call them.

Our `MouseInfo` class provides several methods which **return** data about the user's mouse. If the user's mouse were at the very center of the screen, a call to `mouseInfo.getX()` would return a value of `300` (600 divided by 2).

## Follow Along

Update the `drawLine` method to draw from (0,0) to the x and y position of the `Mouse`:

```java
paint.drawLine(0, 0, mouseInfo.getX(), mouseInfo.getY());
```

## Run the Program

We now see that each frame we draw a new, randomly colored line from the top corner of the screen to the mouse cursor. Move the mouse around to draw a radiant image.
