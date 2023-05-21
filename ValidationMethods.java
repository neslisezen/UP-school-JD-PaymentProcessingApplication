package homework5;

import homework5.Exceptions.*;

/**
 * @author Sezen, Neslihan(NS)
 * @version 1.0
 * @since 2023-05-21
 * 
 */

public interface ValidationMethods{
	
	public void PaymentAmountValidation(String paymentAmount) throws InvalidAmountException; 	
	/**
	 * This method is used to check if pay amount  
	 * has been entered correctly.
	 * Negative or floating point number is not allowed.
	 * @return nothing	 
	 * @exception throws InvalidAmountException
	 */
	public void CardNumberValidation(String cardNumber) throws InvalidCardNumberException;
	/*
	 * This method is used to check if card number  
	 * has been entered correctly.
	 * Card number must be 16 digits and contain only numbers. 
	 * @return nothing	 
	 * * @exception throws InvalidCardNumberException
	 */	
	public void ExpirationDateValidation(String expirationDate) throws InvalidExpirationDateException;
	/*
	 * This method is used to check if expiration date  
	 * of the card has been entered correctly.
	 * Expiration date must be valid date, not in the past or on a 
	 * non-existent date.
	 * @return nothing
	 * @exception throws InvalidExpirationDateException
	 */
	public void CardSecurityCodeValidation(String cvv) throws InvalidCVVException;
	/*
	 * This method is used to check if CVV(Card Verification
	 * Value) has been entered correctly. 
	 * CVV must be 3 digits and contain only digits.
	 * @return nothing
	 * @exception throws InvalidCVVException
	 */
	public boolean numberCheck(String argument);
	/*
	 * This method is used to check if the argument has just
	 * numbers and is used for the Validation methods.
	 * @return boolean
	 * @exception
	 */
}
