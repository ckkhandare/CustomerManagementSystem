# CustomerManagementSystem
This Customer Management System is built using Object-Oriented programming concepts in JAVA 

### Problem statement
Create CustomerManagementSystem using Object-Oriented programming and impliment all 'CRUD' operations

#### Approch/Flow
1) Create a customer class which uses encapsulation to keep variables private , the customer class contains parameterized constructor , getter setter methods and tostring method
2) Create Customer Type class which is of type enum, it contains what is the type of the customer
3) A class for custom exception handling , centralized exception handling is done in this program
4) A Validationutils class for validation rules, all the rules are written as methods in a seperate file to have a good readability of the driver class containaing the main method and to keep the code clean and neat.
If any exceptions were to occur , the exception will be thrown calling a custom exception and it be caught in the catch block in the tester class 
5) The tester class is actually the driver class containing the main method is runs the menu driven program in a loop untill exit condition is true
