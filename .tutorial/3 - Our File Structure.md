# Our File Structure

All of the files we need for this app can be found in the `Files` tab which is located on the left side of the screen if the `sidebar` is open, and all of our code will be contained within the `src` folder (the "source" folder).

## Source Code

Check out the file under the `src/sketchpad` folder named `SketchPad.java`. This is the primary file we will be editing in this course.

In here we have a section named `initialLaunch`:

```java
  public void initialLaunch() {

  }
```

All of the code in the **codeblock** (between the opening and closing `{}`s) runs once when the program begins. There are no commands in here currently so our app displays a blank canvas. (Which is a great start, actually!)

In the next step we will write our first line of code here.

## Drawing Tools

In the `tools` folder, you can see the names of some of the tools we have at our disposal. You can take a look at the actual code for those tools, or you can look in the `documentation` folder to see written descriptions of what those tools can do.

<details>
<summary> More on tools</summary>

Each of these files represents a **class**, and each class has a set of **methods** it can perform. For example, the `PaintingTool` class has methods for drawing a line or a circle. While the `MouseInfo` class has methods for detecting mouse input and position.

### List of Tool Classes
* `Color` - Contains color information for several colors, and allows us to create our own colors.
* `Generator` - Used to generate random numbers.
* `MouseInfo` - Contains information about the mouse: where it is, what buttons are being pressed, etc.
* `PaintingTool` - Contains methods for drawing shapes, lines, and colors to the screen.
* `Screen` - Contains information about our canvas such as it's dimensions.
</details>
<br>
