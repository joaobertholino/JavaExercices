package season11.model.entities;

import season11.model.exceptions.IllegalOperationException;
import season11.model.exceptions.IllegalValueException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) throws IllegalValueException {
		if (amount <= 0) {
			throw new IllegalValueException("Invalid value");
		}
		this.balance += amount;
	}

	public void withdraw(double amount) throws IllegalOperationException {
		if (amount > this.balance) {
			throw new IllegalOperationException("Amount greater than the account balance");
		} else if (amount > this.withdrawLimit) {
			throw new IllegalOperationException("Amount greater than the account withdrawal limit");
		}
		this.balance -= amount;
	}
}
