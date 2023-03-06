# Implementing Class Methods

So, the `ClearButton` class is mostly complete. Take a moment to look around at some of it to see how much you can make sense out of.  

If we check out the `performAction` method, it is currently blank. This method is called when the user clicks on the button (as we have set up in the `update` method), and since this is a `ClearButton`, this method should clear the screen.

Describing the intended behavior of a method is one of the most important parts in designing a class. Writing the method code is called "implementing" the method.

## Implementing the `performAction` Method

What does it mean to "clear the SketchPad" in our app? Well, let's think about the desired result. What does a cleared SketchPad look like?

A cleared SketchPad would look like a white rectangle, just as it does when we start the program. So we can accomplish this by drawing a white rectangle over our entire SketchPad.

## Follow Along

Implement the `performAction` method of the `ClearButton` class to draw a white rectangle over the SketchPad. We will use the same coordinates, length, and width as our original rectangle.

```java
public void performAction() {
        //+ Draw a new rectangle over the interior to clear the screen
        paint.setFillColor(Color.WHITE);
        paint.drawRect(30, 30, 540, 340);
        //
    }
```
