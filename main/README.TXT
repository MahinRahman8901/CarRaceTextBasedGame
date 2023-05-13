Student name: Mahin Rahman	
Student number: 200264183

Now complete the statements below for each level you wish to be marked. Replace all text in square brackets.

LEVEL ONE

My code demonstrates inheritance in the following way...

I have a superclass called [Player]

This superclass is extended into at least two subclasses called [BettingSystem, WinningSystem]

For each of the named subclasses complete the following...

Subclass 1.

Subclass [BettingSystem] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [Bet]

These/this new properties/property are used by the subclass in the following way: [Sets the amount of money the user has and takes in how much the bet is and can add and subtract from the total amount]

Subclass [BettingSystem] extends the superclass by overriding the following methods (there must be at least one): [getMoney()]

These overridden methods are used in the working code in the following places: [File Name: BettingSystem |  Line Number: 18 ]

Subclass 2.

Subclass [WinningSystem] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [winnings, losses]

These/this new properties/property are used by the subclass in the following way: [Caclulates how much the player has won if they have bet succesfully or lost if they havent chosen the right car]

Subclass [WinningSystem] extends the superclass by overriding the following methods (there must be at least one): [getMoney()]

These overridden methods are used in the working code in the following places: [File Name: WinningSystem |  Line Number: 53]


LEVEL TWO

Polymorphism consists of the use of the Substitution principle and Late Dynamic binding.

In my code, polymorphism is implemented in at least two places…

Example 1.

The substitution principle can be seen in use in [Class Name: Main | Line Number: 110 ]. The name of the superclass used in this example is [Player] and the subclasses used are [BettingSystem].

Late dynamic binding can be seen in [Class Name: Main | Line Number: 117 ].

[Explain briefly (no more than four sentences), why this example of polymorphism is necessary in your code.]
The substiution principle allows me to have a new Player of type BettingSystem in this case "a2". When you run a2.getMoney() it receives the total amount and deducts the users input of how much they want to bet and then returns the total. This can then be outputted on the screen to check how much they have bet and if they bet over their amount then they will get an error message. Whereas if I were to run a.getmoney then this would only return the total amount in the users account this can be seen in line 98 in class Main 

Example 2.

The substitution principle can be seen in use in [Class Name: Main | Line Number: 44]. The name of the superclass used this in example is [Vehicle] and the subclasses used are [BMW].

Late dynamic binding can be seen in [Class Name: Main | Line Number: 56].

[Explain briefly (no more than four sentences), why this example of polymorphism is necessary in your code.]
In this example I created a new Vehicle of type BMW called "b". Now b can do a lot of things such as change the overheat status of the car and thus increasing the horsepower of the car leading it to be more competitive in the race. Therefore on line 56 b.carStats() is necessary as it overrides the carStats() from the super class and on running the program the value of it can change depending on if the user wants to change the Overheat Status or not. Finally this can be detrimental to the game as it can lead to the user either winning more money or losing money on the BMW.
