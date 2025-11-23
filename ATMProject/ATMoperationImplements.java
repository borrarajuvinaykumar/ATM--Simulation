package ATMProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ATMoperationImplements implements ATMinterface {
	ATMMachineMiniProject atm=new ATMMachineMiniProject();
	Map<Double,String>ministmt=new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("AvailableBalance:"+atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if( withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance() ) {
				System.out.println("Collect the cash"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				ministmt.put(withdrawAmount, "Amount withdraw");
				viewBalance();
			}else {
				System.out.println("Insufficient Balance");
			}

		} else {
			System.out.println("enter the amount in terms of 500");
		}

	}

	@Override
	public void depositAmount(double depositeAmount) {
		System.out.println("depositedAmount is:"+depositeAmount);
		atm.setBalance(atm.getBalance()+depositeAmount);
		ministmt.put(depositeAmount, "depositeAmount successfully");
		viewBalance();

	}

	@Override
	public void viewMiniStatement() {
		Set<Double>set =ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+""+ministmt.get(d));

		}
	}

}
