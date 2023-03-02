# Defining the Task to Repeat

We know that the task we want our program to repeat is that of drawing a randomly sized circle, at a random location within the canvas. So let's start by creating a method which does exactly that.

Create a method named `randomCircle` outside of and beneath the `update` method like so:

```java
public class SketchPad {
    ...

    public void initialLaunch() {
        ...
    }

    public void update() {
      ...
    }

    //+ Create a new void method here
    public void drawRandomCircle() {

    }
    //
}
```

Next we'll define, using code, what it means to draw a random circle.

<details>
<summary>Declaring Methods</summary>
Declaring methods is a lot like declaring variables. We supply the access level and a name, but the type is instead called a **return type**.

### Return Types

The **return type** describes the type of data that will be returned by the method. For example a method that adds two integers together may return the resulting value, and therefore would be of type `int`

Some methods do not return any values. So what should their return type be? In Java we use the type `void` to say "this method does not return any data". Since our `drawRandomCircle` method draws a circle to the screen but does not return any data, it should be of type `void`.

### Parameters

We may sometimes also need to define variables for taking in data when the method is called. These variables are called **parameters**. In our method above, we have no parameters and so our `()`s are empty.

Imagine again a method that adds two integers together and returns their result. Its method header would need two `int` type variables to "take in" the values we want summed. It may look like this:

```java
public int sum(int a, int b) {

}
```

Here the return type is `int` and in the `()`s we list two parameters, both of type int, named `a` and `b`.

### Return values

Taking this one step further, we might see the above method implemented like so:

```java
public int sum(int a, int b) {
  return a + b;
}
```

We use the `return` keyword to send the result of `a + b` back to wherever this method was called from.
</details>
<br>
