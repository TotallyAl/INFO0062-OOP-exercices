# Object Oriented Programming – Exercises Series 9

## Exercise 1:

**What is the practical effect of the synchronized keyword in the signature of the `welcome()` method in PollingStation? Why is it relevant in this simulation?**

- The keyword `synchronised` blocks the other threads from calling the function until a thread that is already using it finishes. Once a thread is finished with the called function, it unlocks and waits for a new thread to make a request.

**Remove the keyword, re-compile the simulator and run it a few times. What happens ? How does it affect the outcome ?**

- We get less than 250 votes each time. This is because, threads access the `welcome()` function at the same time. This means that multiple threads will, not take into account the other threads that are calling the function at the same time.

- When a two threads call the unsynchronized function at the same time, they access the values and increment at the same time. Thus, an incrementation is then ignored.

**Suppose that the operations of the welcome() method are split into two separate methods, one for registering the voter and another one to get his or her decision. Would it change the outcome of the referendum? Why?**

- It doesn't change the outcome of the referendum, its the same code that executes. The only difference would be the time of execution.

- Before, each thread called the `welcome()` function one at a time, with each thread having to wait a certain amount of time(because of implementation of the function). But now, since we removed the `synchronized` keyword, the threads can all call simultaniously the function `welcome()` and they can all wait the time freeze at the same time. They then have to wait, one at a time, before calling the function `recordVote()`, which is `synchronized`. We thus, have a better time execution than before.
