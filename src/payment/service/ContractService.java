package payment.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import payment.Contract;
import payment.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService() {}
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());
		
		List<Installment> listInstallment = new ArrayList<Installment>();
		double valueMain = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			cal.add(Calendar.MONTH, 1);
			
			double interst = onlinePaymentService.interest(valueMain, i);
			double fee = onlinePaymentService.paymentFee(interst + valueMain);
			
			double valueParcel = valueMain + interst + fee;
			Installment installment = new Installment(cal.getTime(), valueParcel);
			listInstallment.add(installment);
		}
		contract.setListInstallment(listInstallment);	
	}
}
