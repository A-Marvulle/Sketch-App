# Setting a Background Color

Let's write our first command! In this step, we'll use a method to change the background color.

## Calling Methods

When we want our program to perform the code within a method, we say we are **calling** the method.  We can **call a method** by writing the name of the method and supplying any information it needs within a pair of `()`s.

The `setBackgroundColor` method *belongs to* the `Screen` and requires us to specify a `Color`.

## Follow Along

Inside of the `initialLaunch` codeblock, write the following:

```java
  public void initialLaunch() {
    screen.setBackgroundColor(Color.ORANGE);
  }
```

Press the Run button and you should see an orange background for your canvas.

Also try some other Colors `Color.BLACK`, `Color.GREEN`, `Color.PURPLE`.

(*Check out the `Color` documentation or look in the class inside of `tools` for a complete list of colors*).

<details>
<summary>How does this method call work?</summary>

If you look in the `Screen` documentation or directly in the class inside of the `tools` directory, you will see it has a method named `setBackgroundColor`.

In the **method header** you'll not only find the name of the method, but also you can see where it asks for a `Color` as input.

So, in order to use this method, we need to specify that we want to use the `setBackgroundColor` method of the `Screen` class.
</details>

<details>
<summary>What if I want a custom color?</summary>

This will be covered in the next day!

Want a sneak peak? The `Screen` class has a second method named `setBackgroundColor` which takes in three int values. These values can be sent by typing in whole numbers instead of a Color directly. The values should be from 0 to 255.

</details>
<br>
