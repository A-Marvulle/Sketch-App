# Using Objects in Our Code

So now we've created an object from our class. If we run the program, we still won't see our button, but it will now exist in memory.

In order to make our button useable, we'll need to call its methods.

## Calling Object Methods

First, we'll make our button appear on the screen by calling the `drawSelf` method of our `clearButton` object.

At the bottom of the `initialLaunch` method of the SketchPad, add a call to `clearButton.drawSelf()`:

```java
// The interior sketch surface
paint.setFillColor(Color.WHITE);
paint.drawRect(30, 30, 540, 340);

//+ Ask the clear button to draw itself
clearButton.drawSelf();
//
```

## Run the Program

Press the Run button now, and you should see the `clearButton` object gets drawn at position `(5,5)` just as we said in the constructor.
