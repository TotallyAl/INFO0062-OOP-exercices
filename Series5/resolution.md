# Object Oriented Programming – Exercises Series 4

## Exercice 1:

These two classes are very similar. We can see that Country contains all the variable and methods of Location but also add new variable and methods.
So here, we have redundacy which can be avoided by declaring Country as a subclass of Location.
We can say that Country is a particular case of Location.
Then, regarding the theory, we can say that it's an example of Specialization

## Exercice 2

We can draw the subclassing relation like this:

            Location
           /        \
          /          \
        City       Country

City and Country are both Specilization of Location. They are both a particular case of location.

BONUS: Let us now consider that we want to store the country variable
(of an instance of City) as an object of the class Country.
-> See CountryBonus where I defined a class variable storing all the Country created.
A other method is created countryCreationCheck which check if the country we want to create is already instantiate or not.
We also have getCountry which is public to be able to retrive the city and create one if needed.
This is important as you can see on line 33 that we create the Country before adding it to the Vector.

## Exercice 3

## Exercice 4
