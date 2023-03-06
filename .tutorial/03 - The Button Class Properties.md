# The Button Class

If you look in the `buttons` directory, you will see the `ClearButton` class has been mostly completed for you. On this page we will discuss each part of this class.

## Properties

At the top of the class we have **properties** (also called **fields** and **instance variables**). These are the variables that hold the information about our button.

```Java
  private MouseInfo mouseInfo = new MouseInfo();
  private PaintingTool paint = new PaintingTool();

  private int leftX;
  private int topY;
  private int size;
  private Color color;
```

<details>
<summary>More about properties</summary>
    
**Properties** are where classes allow data to be stored. We usually make our properties `private`, so that they cannot be accessed directly.

We will see in the next page that we sometimes have `public` "getter" methods which allow entities outside of the class the ability to *read* the value of each property.
</details>
<br>
