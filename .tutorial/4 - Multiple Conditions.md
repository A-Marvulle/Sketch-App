# Multiple Conditions

We're off to a good start writing our first condition. Next we'd like to restrict our pen a little more, only allowing it to draw lines within the sketchpad area and not inside the bordering area.

To do this, we'll need to join multiple conditions together used the **and operator** written `&&`.

## Example

If we wrote a two part condition like so `(5 < 10 && 5 > 10)`:
  - The first condition `5 < 10` is true but the second condition `5 > 10` is false.
  - The `&&` operator requires the first *and* the second condition to be true, and thus the combined condition is `false`.

We are going to want to write a condition that says: "IF (mouse is dragged AND mouse is in the sketchpad region) THEN { draw lines }"

But how do we explain to the computer what it means for the mouse to be "inside the sketchpad"?...

<details>
<summary>Additional Boolean Logic Operators and Expression Examples</summary>

In addition to the and-operator `&&` we also have the or-operator `||`. This is made of two pipe symbols, a key which you can find under the "backspace" button on most keyboards.

Additionally we have the not-operator `!`. This flips a `true` to a `false` or vice-versa. For example `(!(5 < 10))` which you can read as "not 5 is less than 10" will evaluate to `false`.

All **boolean expressions** evaluate to either `true` or `false` in the end, but may take a few steps to break down.

### Boolean Expression Multi-Step Example

Let's break down the expression `(!false && (false || true))`.

We'll start with the inner-most pair of `()`s which reads `false || true`. This evaluates to `true` if either side of the `||` operator is `true`. The right side is `true` and so the whole expression is `true`.

Now we have `(!false && true)`. An and-expression is only `true` is both the right and left sides of the operator are `true`.

We can replace the `!false` with `true` and see that our expression now reads `(true && true)` which, finally, evaluates to `true`.

### Practical Booleans

In a real program, you usually aren't going to write `true` or `false` on their own. You'll be using either a boolean variable such as `MouseInfo.isPressed()` or `myNumber < yourNumber && yourNumber > 100`.

But it's important to remember that all expressions evaluate to either `true` or `false` in the end.

</details>
<br>
