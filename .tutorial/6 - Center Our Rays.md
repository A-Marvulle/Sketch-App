# Center Our Rays

Instead of starting the lines from the top left corner (0,0), let's draw them from the center of the screen.

## Using Literal Values

We *could* accomplish that by determining the coordinates ourselves. The width of the screen is 600 and the height is 400 so we divide those by 2 and edit the `drawLine()` method like so:

```java
paint.drawLine(300, 200, mouseInfo.getX(), mouseInfo.getY());
```

However, we prefer not to use **literal values**, the 300 and the 200, whenever we can avoid it.

Consider how if we ever changed our screen size, we'd have to remember to come back here and change the coordinates of the center. Instead we can have our program find the center itself

## Using Programmatic Values

Here we make use of the Screens' `getWidth()` and `getHeight()` methods.

```java
paint.drawLine(screen.getWidth() / 2, screen.getHeight() / 2, mouseInfo.getX(), mouseInfo.getY());
```

Now if we ever change the screen size, we don't have to worry about updating this code.
