# Object Oriented Programming – Exercises Series 2

## Exercise 1:

**Do you need to manage several Pascal's triangles represented as separate objects ?**

- Since we can compute all coefficients from one Pascal's triangle, it is pointless to instanciate multiple times a Pascal's Triangle.

**Do you need to use instance variables, class variables, or both ? Why (not) ?**

- Since we won't need multiple instances of the triangle, we will only need class variables. Instance Variables would've been useful if we needed multiple Pascal's triangles.

**What kind of data structure can you use to manage the coefficients ?**

- To manage the coefficients, I use a double array of `long` : `private static long[][] triangle;`

- Another way would be to use a `Vector<long[]>`, from the library `java.util.Vector`

## Exercise 2

**What kind of variable are you going to use to store a coefficient ?**

- I'll use a long variable, this allows me to store a coefficient up to 2^63.

**How do you handle the computation of a coefficient for invalid values of n and k ?**

- We check if the values are valid before hand.

**What is the appropriate visibility for each component of your `Pascal` class ?**

- See file to answer question.
