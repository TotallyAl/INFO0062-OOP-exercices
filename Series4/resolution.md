# Object Oriented Programming – Exercises Series 4

## Exercice 1

**Issue**: The Walter program couldn't exit the while loop because it used `==` to compare strings.

**Solution**: In Java, string comparison should use `.equals()` method, not `==`. The `==` operator compares object references (memory addresses), while `.equals()` compares the actual string content.

**Fixed code**: Changed `if (answer == "Heisenberg")` to `if ("Heisenberg".equals(answer))`.

**Key learning**: Always use `.equals()` for string comparison in Java. Using the literal first (`"Heisenberg".equals(answer)`) prevents NullPointerException if the variable is null.
