# Creating a ClearButton Object

What we have now is a completed class, that is, a completed *description* of what a `ClearButton` is.

If we were to run our program, we wouldn't see any buttons. That's because we never actually *created* a `ClearButton`, we just defined the class.

## Creating a ClearButton Instance

Back in our `SketchPad` file, among the variables near the top, we'll create a new variable of type `ClearButton`. We'll name this variable `clearButton` with a lowercase `c`. This will declare to Java that we would like a variable to exist that will look at a `ClearButton` object and we have specified its name to be `clearButton`.


```java
private int lastMouseX;
private int lastMouseY;

//+ Declare a variable for the clear button
private ClearButton clearButton;
//

public void initialLaunch() {
  ...
}
```

*We could name this whatever we want, but this is the typical naming convention most developers use.*

## Instantiating an Object

Now we set the value of this variable to `new ClearButton` object. When we do this, we call upon the **constructor** we discussed previously, providing our object with values for its **properties**. Our constructor header looked like this:
```java
  public ClearButton(int incomingX, int incomingY,
                      int incomingSize, Color incomingColor)
```
So we will need to send in an incoming x and y values, a size (the length of our button), and what color it should be filled in with. Let's put our button close to the top left of the screen, give it a size that keeps it in the margins, and then make it use a white background.



```java
private int lastMouseX;
private int lastMouseY;

//+ Declare and initialize a variable for the clear button
private ClearButton clearButton = new ClearButton(5, 5, 20, Color.WHITE);
//

public void initialLaunch() {
  ...
}
```



So then we've set the `ClearButton` object's x and y-coordinates both to `5`, the size of the button to `20`, and the color the `Color.WHITE`.

When we use the word `new`, we say we are creating an "instance" of the `ClearButton` class. This builds an "object".