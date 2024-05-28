package season13.model.entities;

import season13.model.services.ContractService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	private final List<Installment> installment = new ArrayList<>();
	private ContractService contractService;

	public Contract() {
	}

	public Contract(Integer number, LocalDate date, Double totalValue, ContractService contractService) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.contractService = contractService;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallment() {
		return installment;
	}

	public ContractService getContractService() {
		return contractService;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("Parcelas:\n");
		for (Installment installment : this.installment) {
			result.append(installment).append("\n");
		}
		return new String(result);
	}
}
