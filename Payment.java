/**
 * @author Sezen, Neslihan (NS)
 * @version 1.0
 * @since 2023-05-21
 */
package homework5;
import java.util.Random;
import java.util.Scanner;
import homework5.Exceptions.*;

public class Payment {
	static Validation validation = new Validation();
	static Scanner input = new Scanner(System.in);
	static boolean isEverythingGood = false;
	
	public static void main(String[] args) {
		doPayment();
	}
	
	public static void doPayment () {
		
		
		while(isEverythingGood==false){
			amountInfo();
		}
		
		isEverythingGood = false;
		while(isEverythingGood==false){
			cardNumberInfo();
		}
		
		isEverythingGood = false;
		while(isEverythingGood==false){
			expirationDateInfo();
		}
		
		isEverythingGood = false;
		while(isEverythingGood==false){
			cvvInfo();
		}
		
		isEverythingGood = false;
		while(isEverythingGood==false){
			systemInfo();
		}	
		System.out.println("Your payment is successful!");
		
	}
	
	public static void amountInfo() {
		String paymentAmount;
		try {
			System.out.print("Please enter the amount of money you want to pay: ");
			paymentAmount = input.nextLine();
			validation.PaymentAmountValidation(paymentAmount);
			isEverythingGood = true;
		}
		catch(InvalidAmountException e) {
			System.out.println(e.getMessage());	
		}
	}
	
	public static void cardNumberInfo() {
		String cardNumber;
		try {
			System.out.print("Please enter your card number: ");
			cardNumber = input.nextLine();
			validation.CardNumberValidation(cardNumber);
			isEverythingGood = true;
		}
		catch(InvalidCardNumberException e) {
			System.out.println(e.getMessage());	
		}
	}
	
	public static void expirationDateInfo() {
		String expirationDate;
		try {
			System.out.print("Please enter the expiration date of your card in the format of MM/YYYY: ");
			expirationDate = input.nextLine();
			validation.ExpirationDateValidation(expirationDate);
			isEverythingGood = true;
		}
		catch(InvalidExpirationDateException e) {
			System.out.println(e.getMessage());	
		}
	}
	
	public static void cvvInfo() {
		String cvv;
		try {
			System.out.print("Please enter card verification value (CVV) of your card: ");
			cvv = input.nextLine();
			validation.CardSecurityCodeValidation(cvv);
			isEverythingGood = true;
		}
		catch(InvalidCVVException e) {
			System.out.println(e.getMessage());	
		}
	}
	
	public static void systemInfo() {
		
			try {
				Pay();
				isEverythingGood = true;
				System.out.println("Everything went well!!");
			}
			catch(SystemNotWorkingException e) {
				System.out.println(e.getMessage());
			}
		}
	
	public static void Pay () throws SystemNotWorkingException {
		
		Random random = new Random();
		int luckyNumber = random.nextInt(101);
		if(luckyNumber > 75) 
			throw new SystemNotWorkingException("System is not working!! Please try again...\n");
	}
	
}
