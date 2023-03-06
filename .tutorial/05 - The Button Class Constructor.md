## Constructor

This is a special method which we use to set the initial values of our properties when an object is created. The interior code of a constructor is run each time we create an object of the type `ClearButton`.

Here we see that in order to create a `ClearButton`, you must provide:
- An `x-coordinate`
- A `y-coordinate`
- A `size`
- A `color`

*In that order*:

```Java
  public ClearButton(int incomingX, 
                     int incomingY, 
                     int incomingSize, 
                     Color incomingColor) {
    leftX = incomingX;
    topY = incomingY;
    size = incomingSize;
    color = incomingColor;
  }
```

<details>
<summary>More about the constructor</summary>
Notice that the constructor has no name and that it must be the same type as the class itself.

Every class must have at least one constructor in order to create an object (we will get to objects later in the lesson). Its purpose is to take in data values to be assigned to each property. This is how we can say we are "constructing" our object.

One `ClearButton` may have a size of 20, while another, larger `ClearButton` may have a size of 50. The constructor is where we specify these values.

## Multiple Constructors

It is possible to create multiple constructors for the same class. This allows users to construct an object from the class in different ways. Here is an example of a **no-arguments constructor**, which takes in no information and assigns a default value to each property:

```java
public ClearButton() {
  leftX = 100;
  topY = 100;
  size = 50;
  color = Color.BLACK;
}
```
*This constructor could exist in addition to our current constructor.*

With this we'd be able to construct a `ClearButton` object by providing all of the information, or none of the information. We could also create yet another constructor that takes in just the `x` and `y` coordinates, but assigns a default size and color. This can simplify the creation process and make using our class easier.
</details>
<br>
