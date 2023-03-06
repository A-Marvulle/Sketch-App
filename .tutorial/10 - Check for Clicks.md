# Check for Clicks

Our button is now drawing itself, but it doesn't clear the screen when we click it. This is again because *we never told it to*. An object may have the capability of doing many actions, but it must be told to perform those actions.

## Follow Along

We have an `update` method inside of the `ClearButton` class that is set up to check if it is being clicked on, and to call `performAction` if it is.

We therefore need to call the `clearButton` object's `update` method from within our SketchPad's `update` method:

```java

  //+ Ask the clearButton to run its update method
  clearButton.update();

```

## Run the Program

Now we should have a working clear button. Draw some lines on the canvas and then click the button, this should clear the screen.
