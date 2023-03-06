
## Methods

A bit further down we have some methods which define the actions our class is able to perform.

```Java
public void drawSelf() {
  //How the button should display on the screen
  ...
}

public boolean isPressed() {
  //Logic to determine if this button is being pressed: true or false?
  ...
}

public void update() {
  //The update method will keep checking if the button isPressed
  ...
}

public void performAction() {
  //The "meat" of our class, what should this button do when it is pressed?
  //We will implement this method later in the lesson.
  ...
}
```

<details>
<summary>More about methods</summary>

These methods belong to the `ClearButton` class. We've actually been using methods from other classes this whole time! When we write `paint.drawRect()` for example, we are calling the `drawRect` method which is defined in the `PaintingTool` class. You can see this method for yourself if you navigate to `tools/PaintingTool.java`.
</details>

## Getters

Additionally, we have the getters. These are simple, public methods that allow other entities (or our own class) to get data from the class which would otherwise be hidden.

```Java
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
```

<details>
<summary>More about getters</summary>
If we make our properties `public`, then other classes have direct access to their values. This might not always be a bad thing, but typically we prefer to keep our properties `private` and allow read access through these getter methods.  

This way other classes can still read data from this class if they need to, but can't change the value of these properties, possibly incorrectly, which could break our button.
</details>

<details>
<summary>Setters</summary>

There is also such a thing as a "setter" which is a `public` method which would allow an outside class to modify the value of our class' properties. We may only allow setters to specific properties, and we may add logic to a setter to prevent misuse.

For example, maybe we'd like to allow another class to change the size of our button (for some reason). By implementing a setter, we can add additional logic to make sure the size of the button does not go below or above certain values. We could decide that you cannot make a button who size is zero, or even say, less than 10. It may therefore look like this:

```
public void setSize(int sizeToSet) {
  if (sizeToSet > 10) {
    size = sizeToSet;
  }
}
```
</details>

<br>
