# Conditions

A condition is any statement that is either `true` or `false`. In Java, these statements represent a type of value called a **boolean**.

## Example boolean values

1. The comparison `(5 < 10)` is true, and so Java reads this as the boolean value `true`.
2. The comparison `(5 > 10)` is not true, and so Java reads this as the other boolean value `false`.
3. We may use a variable whose value changes in our condition, `(mouseInfo.getX() > 100)` may be `true` or it may be `false` depending on the mouse's x position.
4. Some variables may be of type `boolean` and will hold the value of either `true` or `false`. We will use `mouseInfo.isMouseDragged()` to check if the user is dragging the mouse (`true`) or not (`false`).

## Writing an If-Statement

We use these conditions within an if-statement to run a section of code *if the condition is true* then we perform the code in between the proceeding `{ }`s.

For example:

```java
private boolean myCondition = true;

if (myCondition) {
  //do this action
}
```

*(We are not adding this code to our program).*
