This assignment is about an automatic vending machine which brews different types of Coffee and Tea beverage.

I didnt use any design pattern for this assignment.


• How flexible is your implementation, e.g., how you add or remove in future new drink types?

It is flexible as we can different types by creating objects or by creating a new class implementing the Beverage Interface.

• How is the simplicity and understandability of your implementation?

It is easy. Created 2 classes - Coffee and Tea which implements the BeverageInterface. Created 1 class -Condiments which implements the CondimentsInterface.
Here, tea/coffee and condiments are considered as different objects belonging to different classes

• How you avoided duplicated code?

Instead of creating class for each type of beverage and implementing the functionalities, I am creating objects . Example. "Black Tea" would be an object of the Tea class.