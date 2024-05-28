package season13.model.services;

import season13.model.entities.Contract;
import season13.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService() {
	}

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) throws IllegalArgumentException {
		double installmentTotalValue = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			double installmentValue = this.onlinePaymentService.interest(installmentTotalValue, i) + installmentTotalValue;
			installmentValue += this.onlinePaymentService.paymentFee(installmentValue);
			LocalDate installmentDate = contract.getDate().plusMonths(i);
			contract.getInstallment().add(new Installment(installmentDate, installmentValue));
		}
	}
}
