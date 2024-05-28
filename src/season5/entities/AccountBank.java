package season5.entities;

public class AccountBank {
	private final int accountNumber;
	private String cardholderName;
	private double accountBalance;

	public AccountBank() {
		this.accountNumber = 0;
		this.cardholderName = null;
		this.accountBalance = 0.0;
	}

	public AccountBank(int accountNumber, String cardholderName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.cardholderName = cardholderName;
		this.accountBalance = accountBalance;
	}

	public void deposit(double value) throws IllegalArgumentException {
		if (value > 0) {
			this.accountBalance += value;
		} else if (value == 0) {
			throw new IllegalArgumentException("It is not possible to deposit this amount");
		} else {
			throw new IllegalArgumentException("Invalid value");
		}
	}

	public void withdraw(double value) throws RuntimeException {
		if (this.accountBalance >= value) {
			this.tax();
			this.accountBalance -= value;
		} else {
			throw new RuntimeException("Insufficient funds");
		}
	}

	private void tax() {
		this.accountBalance -= 5.00;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getCardholderName() {
		return cardholderName;
	}

	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "Account number: " + this.getAccountNumber() + "\n"
				+ "Cardholder name: " + this.getCardholderName() + "\n"
				+ "Account balance: " + this.getAccountBalance();
	}
}
