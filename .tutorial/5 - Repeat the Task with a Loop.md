# Repeat the Task with a Loop

Now that we've drawn one random circle, we are very close to drawing 50. The neat thing about programming is that it doesn't take 50 times the effort to make 50 calls to the same method.

## For Loops

We're going to make use of a **for loop** control structure. This type of loop needs three things from us
1. A **counter** this is an integer variable it to uses to count the number of loops it has performed.
2. A **condition** which must be true that we use to tell the loop when to stop.
3. An **iteration** where the loop increases the counter value by 1.

Essentially the for loop is going to count up to 50, and each time it counts it will perform all of the code written in its `{}`s.

## Writing a for loop

The way we write a for loop can look pretty complicated at first, but let's start by writing it out.

In the `initialLaunch` method, surround the `drawRandomCircle` method call with this for loop and `{}`s like so:

```java
for (int circleNumber = 0; circleNumber < 50; circleNumber++) {
  drawRandomCircle();
}
```

<details>
<summary>See Explanation</summary>

In the above code you can see our three pieces separated by `;`s. The **counter** `circleNumber`, the **condition** `circleNumber < 50` and the **iteration** `circleNumber++`. (The `++` operator is a shorthand way of saying "add `1` to this variable's value").

Here is one way you can read this for loop to yourself:

```
FOR an integer named 'circleNumber' which starts at 0; WHILE the value of 'circleNumber' is less than 50; Increase 'circleNumber' by 1 (and perform the code inside the {}s).
```
</details>

## Try it out

Run the program and you should see lots of random circles decorating the background!

Now you can "uncomment" the code at the end of the `initialLaunch` method so that we display the sketchpad once again.

Try increasing/decreasing the number of circles and see if there is a value you like other than 50!
