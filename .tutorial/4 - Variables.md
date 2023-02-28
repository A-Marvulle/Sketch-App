# Declaring Variables with Types

A variable in computer programing is a labeled area in memory which can contain a **value**. The label or **name** can then be referenced in the program to update or access the value.

<details>
<summary>The Three Parts of Creating a Variable</summary>

There are generally 3 parts to "declaring" (creating) a variable in Java.
  1. The **name** of the variable.
  2. The **type** of data it holds: numbers, words, or complex data.
  3. The **access level** of the data, usually either `private` or `public`.

*In Java, each variable must specify what type of data it holds. We therefore refer to Java as a "statically typed" language. Languages which have no such requirement and allow variables to hold any type of data are called "dynamically typed" languages.*
</details>

## Follow Along

Let's create two variables to track the previous position of our mouse cursor at the end of each `update` call. Inside the `DrawingBoard` class and above the `initialLaunch()` method add these two variables:

```java
public class DrawingBoard {
    private Canvas canvas = new Canvas();
    private MouseInfo mouseInfo = new MouseInfo();
    private PaintingTool paint = new PaintingTool();

    //+ Declare variables for the previous mouse coordinates
    private int lastMouseX;
    private int lastMouseY;
    //

    public void initialLaunch() {
      ...
    }
    ...
  }
```

Here we are saying the name of our variables are `lastMouseX` and `lastMouseY`.

Since these variables will store coordinates, we will make them type `int` which stands for "integer" (meaning a number without decimal places). We can change the data stored in these variables, but it must always be an integer value.

Lastly we set the access level to `private`. We aren't going to worry about access level much in this course. For now we'll say that `private` means it can only be accessed within the `DrawingBoard` and not anywhere else.
