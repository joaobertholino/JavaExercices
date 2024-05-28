package season13.model.services;

public interface OnlinePaymentService {
	double interest(double amount, int months);
	double paymentFee(double amount);
}
