package application;

public class InsufficientFundsEception extends RuntimeException {

	public  InsufficientFundsEception() {
		super("Enter the complete payment");
	}
}
