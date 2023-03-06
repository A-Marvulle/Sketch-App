# Classes

A **class** is a collection of variables and methods which define a type in Java. In our application, we would like to start creating clickable buttons which the user can press to perform actions. Therefore, we need to define what a "button" is in the first place and how it works.  

Our first button will be used to clear the screen when it is pressed.

## Objects from Classes

When we build "things" in Java, we first start by creating a class to describe it. Once our class is defined, we can make variables whose type is of that class. Variables whose type is of a class will represent a name for an **object**, and it's the objects which actually perform the actions.

## Buttons as Objects of a Class

So in our program, we need to
1. Define what a clear button is by creating a class for it, `ClearButton`.
2. Create an object whose type is `ClearButton`.
3. Tell our `ClearButton` object to draw itself on the screen, and to clear the screen when it is pressed.
