package season13.model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public double interest(double amount, int months) {
		if (amount <= 0 || months < 1) throw new IllegalArgumentException();
		return amount * 0.01 * months;
	}

	@Override
	public double paymentFee(double amount) throws IllegalArgumentException {
		if(amount <= 0) throw new IllegalArgumentException();
		return amount * 0.02;
	}
}
