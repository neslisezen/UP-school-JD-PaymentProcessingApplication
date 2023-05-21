/**
 * @author Sezen, Neslihan (NS)
 * @version 1.0
 * @since 2023-05-2
 */
package homework5;
import homework5.Exceptions.*;

public class Validation implements ValidationMethods {

	public void PaymentAmountValidation(String paymentAmount) throws InvalidAmountException {
		if(paymentAmount.contains("-")) {
			throw new InvalidAmountException("It can not contain negative numbers.");
		}
		
		if(paymentAmount.contains(".") || paymentAmount.contains(",") ) {
			throw new InvalidAmountException("It can not contain floating point numbers.");
		}
		
		if(numberCheck(paymentAmount) != true) {
			throw new InvalidAmountException("It must contain only numbers.");
		}
		return;
	}

	public void CardNumberValidation (String cardNumber) throws InvalidCardNumberException{
		if(numberCheck(cardNumber) != true) {
			throw new InvalidCardNumberException("It must contain only numbers.");
		}
		
		if(cardNumber.length()!= 16) {
			throw new InvalidCardNumberException("It must be 16 digits.");
		}
	}

	public void ExpirationDateValidation(String expirationDate)throws InvalidExpirationDateException {
		if(expirationDate.length()!= 7) {
			throw new InvalidExpirationDateException("It must be in MM/YYYY format");
		}
		
		String expirationDateArray[] = expirationDate.split("/",2); //it will be in format of MM/YYYY
		String month = expirationDateArray[0]; //it will take first two digit (month)
		String year = expirationDateArray[1]; //it will take last four digit (year)
		
		if(numberCheck(month) != true|| numberCheck(year) != true) {
			throw new InvalidExpirationDateException("It must contain only numbers and / ");
		}
		
		//String values are converted to integer using valueOf
		int monthAsInteger = Integer.valueOf(month);
		int yearAsInteger = Integer.valueOf(year);
		
		if(monthAsInteger >0 && monthAsInteger<13) {
			//do nothing
		}
		else
			throw new InvalidExpirationDateException("It must be a valid date!");	
		
		if(yearAsInteger>2022 && yearAsInteger<2100) {
			//do nothing
		} 
		else	
			throw new InvalidExpirationDateException("It must be a valid date! "
					+ "Not in the past or not in the distant future!");
		
		if(yearAsInteger==2023) { 
			if(! (monthAsInteger>5)) 
				throw new InvalidExpirationDateException("It must be a valid date! Not in the past!");
		}
		
	}

	public void CardSecurityCodeValidation(String cvv) throws InvalidCVVException {
		if(numberCheck(cvv) != true) {
			throw new InvalidCVVException("It must contain only numbers.");
		}
		if(cvv.length()!= 3) {
			throw new InvalidCVVException("It must be 3 digits.");
		}
		
	}

	public boolean numberCheck(String argument) {
		 for (char c : argument.toCharArray()) {
		      if (!Character.isDigit(c)) 
		        return false;
		  }
		return true;
	}


}
