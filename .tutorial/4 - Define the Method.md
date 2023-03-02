# Define the Method

Let's first declare a few variables to make our code more readable:

```java
public void drawRandomCircle() {
  //+ First we define a random x and y position
  int x = Generator.randomInt(screen.getWidth());
  int y = Generator.randomInt(screen.getHeight());
  //
}
```

The width is 600 pixels, and so the x coordinate will be a random integer between 0 and 600.

Now let's pick a random radius for our circles, between 10 and 30 pixels in length:

```java
public void drawRandomCircle() {
  int x = Generator.randomInt(screen.getWidth());
  int y = Generator.randomInt(screen.getHeight());
  //+ Define a radius
  int radius = Generator.randomInt(10, 30);
  //
}
```

Then we'll pick a random color by generating an RGB value with three random integers from 0 to 255:

```java
public void drawRandomCircle() {
  int x = Generator.randomInt(screen.getWidth());
  int y = Generator.randomInt(screen.getHeight());
  int radius = Generator.randomInt(10, 30);
  //+ Generate three random values for RED, GREEN, and BLUE
  int r = Generator.randomInt(255);
  int g = Generator.randomInt(255);
  int b = Generator.randomInt(255);
  //
}
```

Finally, we can draw the circle by using these values we just generated and plugging them into the `setFillColor` and `drawCircle` methods:

```java
public void drawRandomCircle() {
  int x = Generator.randomInt(screen.getWidth());
  int y = Generator.randomInt(screen.getHeight());
  int radius = Generator.randomInt(10, 30);
  int r = Generator.randomInt(255);
  int g = Generator.randomInt(255);
  int b = Generator.randomInt(255);
  //+ Set the fill color and draw the circle using these variable values
  paint.setFillColor(r, g, b);
  paint.drawCircle(x, y, radius);
  //
}
```

## Try it out

In the `initialLaunch` method, call the `drawRandomCircle` method we just defined.
Also "comment out" the code to draw the sketchpad rectangle for now so that it doesn't cover up our circle. Add `//` at the front of those lines of code to turn them into comments. *Just remember to undo that at the end of this lesson.*

```java
public void initialLaunch() {
    screen.setBackgroundColor(Color.CYAN);

    //+ Call the drawRandomCircle method
    drawRandomCircle();
    //    

    //+ Comment out these two lines with //
    //paint.setFillColor(Color.WHITE);
    //paint.drawRect(30, 30, 540, 340);
}
```

When you press Run you should see a single colored circle somewhere on the screen. Pressing Run again should display a differently colored circle in a different location.
