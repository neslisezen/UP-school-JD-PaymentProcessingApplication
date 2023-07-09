## Payment Processing Application


## This project was given by UP School Java Developer Program. Instructions were:

Make an application that allows the user to pay using their credit card information. When paying, the user must enter the payment amount, card number, expiration date and security code. After receiving the information from the user, a verification process must be performed, the constraints are below (Create custom exception classes for constraints, e.g. InvalidAmountException, InvalidCardNumberException). 
Once the restrictions have passed, a method called **pay** should be invoked. Generate a random number between 0-100 in this method, throw your own ***SystemNotWorkingException*** if the number is higher than 75, and try the operation again.

- The format of the payment amount must be correct, a negative value or a comma value cannot be entered.
- The card number entered by the user must be correct (16 digits, consisting of digits)
- An expiration date cannot be entered in a past year such as (12/2013) or a month such as 13.
- The security code format must be correct (3 characters, consisting of numbers)
- When an error occurs during the payment process, the SystemNotWorkingException that you will create specifically should be thrown, and the operation should be tried again 1 time.


