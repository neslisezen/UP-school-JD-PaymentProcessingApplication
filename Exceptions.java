package homework5;
/**
 * @author Sezen, Neslihan (NS)
 * @version 1.0
 * @since 2023-05-21
 */
import java.lang.Exception;

public class Exceptions{

	public static class InvalidAmountException extends Exception {
	
		public InvalidAmountException (String message) {
		super(message);
		}
	}
	
	public static class InvalidCardNumberException extends Exception{
		
		public InvalidCardNumberException(String message) {
			super(message);
			}
	}
	
	public static class InvalidExpirationDateException extends Exception{
		
		public InvalidExpirationDateException(String message) {
			super(message);
			}
	}
	
	public static class InvalidCVVException extends Exception{
		
		public InvalidCVVException(String message) {
			super(message);
			}
	}
	public static class SystemNotWorkingException extends Exception{
		
		public SystemNotWorkingException(String message) {
			super(message);
			}
	}
    }
