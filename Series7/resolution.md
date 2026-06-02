# Object Oriented Programming – Exercises Series 7

## Exercise 1:

**Why doesn't the `clone()` method from the `Book` class clone author and title ?**

- In the `Book.java` class, `clone()` calls `super.clone()`, which only performs a shallow copy. Normally, modifying an object, in this case String, of the copy would also modify the String in the original object. It's important to know, that in Java, Strings are immutable. This means that the object can't be modified. So when we change the name of the book, we create a new object and we assign it to the copied one ; which doesn't modify the original object.

**Then, what is the benefit of the `clone()` method implemented in the `Book` class ?**

- The `clone()` method will perform a shallow copy of the Book object. This means that a new Book object will be created and that author and title variables of the new Book object will be assigned with the same value as the original variable.

**How does the `Book` class implement `equals()` and `hashCode()` ?**

- `equals()`, first Book will check if the object given in argument is an instance of `Book`. Then, the `equals()` method defined in the `String` class is used. We take advantage from the fact that we know that String has a equals method tat performs what we need. We don't know how it is implemented but it is not our responsability to equals two Strings. So we can reuse the `equals()` method, from the `String` class.

- `hashCode()`, similarly as before, we will use the `hashCode()` method defined in the `String` class.

**Why is `log.get(i).clone()` in the `clone()` method from `BookLog` performed superficial cloning ? Why ?**

## Exercise 2:

- In this code we have implemented the desired classes (easy part).

**What are the `hashCode()` functions used for ?**

- They are mostly useless. But they are still implemented for scalability. When we have a list using 10000 groups, for example, we will use a hashTable(SDA course). We thus need to implement the code that will hash our object, so that it can be used in case we need a HashTable.

**How do we implement the `clone()` function for each object ?**

- `Person.java`: We simply make a shallow copy. Since the instance class variables are immutable, we don't need to implement a full deep copy.
  `super.clone()` is sufficient.

- `Group.java`: Here, we need to make a deep copy. Since the instance class variable is a muttable object(`Vector<Person>`) of mutable objects(`Person`), we need to make a copy of all of these objects.
