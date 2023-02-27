# Method Overloading

Right now our line is simply a predefined color which can be found in the `Color` class file. Let's instead add some variety by making our own color.

To do this we'll need to understand a little more about the values we are allowed to pass to our color method.

## Method Overloading

We already know we can pass in a single color value like this:

```java
paint.setLineColor(Color.RED);
```

However, we also have the option to pass in RGB (Red, Green, Blue) values to make our own color. If the method sees three values instead of one, it will read them as amounts of `red`, `green`, and `blue` which can be mixed to form any color. The amount of each can range from 0 to 255.

For example:

```java
paint.setLineColor(255, 0, 0);
```

Will make the line fully red.

```java
paint.setLineColor(100, 0, 0);
```

Will make the line a dark red.

```java
paint.setLineColor(255, 0, 255);
```

Will make a bright magenta.

This ability for a method to take multiple sets of variables is called **method overloading**.

<details>
<summary>Why Method Overloading?</summary>
Method Overloading allows us to use the same method in multiple ways. In our case here, it's nice that we can define a custom color with RGB values. But often we don't want to have to go looking for the exact right values to make, say, the color orange. It's much nicer and more readable when we have the option to simply pass the method a single color variable `Color.ORANGE`.

You will come across use cases like this a lot in programming, where it is not strictly necessary to do this, but it makes our lives as both coder-writers and readers easier.
</details>

## Try It Yourself

Try experimenting with your own color values. You can refer to a [color picker like this](https://g.co/kgs/ZQuYQf) to find RGB values for any color.
