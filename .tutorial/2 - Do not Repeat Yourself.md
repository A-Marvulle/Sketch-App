# DRY - Don't Repeat Yourself

We've described that in this lesson we are going to have our program draw several colored circles on our background. We'll say, specifically, 50 circles.

We have a `drawCircle` method which will allow us to draw a single circle. What we *could* do (but certainly won't) is copy and paste the circle command 50 times. That'll surely get us 50 circles. However, there is a better, more scalable solution that won't come back to bite us later.

<details>
<summary>Read more about the DRY principle</summary>

## Disadvantages of repeating yourself

In doing so, we would now have 50 lines added to our program as a giant blob of text. Imagine later we decide we want to see what 30 circles in would look like, or wait maybe 75 would be better? How about 100 circles? Now it's becoming hard to even count how many circles our code is saying to draw, and it's annoying to try to add or delete exactly 25 more circle calls.

Perhaps we eventually find we'd like to add an option for users to decide how many circles exist in the background. There's no good way to do this if we are writing each circle call in our code manually.

## Using a Loop instead

In the following steps, we will learn to use a **loop** control structure. It allows us to specify a number of times to repeat a sequence of actions or a method. So we can define a method to draw a single circle, and then call it from within a loop which repeats 50 times.

If we want to change the number of circles we can just change the number of times the loops repeats.

If we wanted to make the loop repeat a variable amount of times, we can use a variable instead of the literal value `50`.

## DRY principle

The DRY principle says to avoid repeating yourself whenever possible. Creating a method to define a task for example, allow us to call that method whenever needed, instead of copy and pasting the same code in multiple places.

Additionally, we should use a loop to perform a certain sequence of actions multiple times in a row.

Essentially, any time you find yourself copy and pasting code, ask yourself if there is a better more extensible way. You will learn more techniques to avoid repeating yourself as you further your knowledge of programming.

</details>
<br>