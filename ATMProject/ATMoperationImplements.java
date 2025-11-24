package ATMProject;

import java.util.LinkedHashMap;
import java.util.Set;

public class ATMoperationImplements implements ATMinterface {
	ATMMachineMiniProject atm=new ATMMachineMiniProject();
	LinkedHashMap<Long,String>ministmt=new LinkedHashMap<>();
	long id=0;

	@Override
	public void viewBalance() {
		System.out.println("AvailableBalance:"+atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if( withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance() ) {
				System.out.println("Collect the cash:"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				ministmt.put(++id,")"+withdrawAmount +":Amount withdraw");
				viewBalance();
			}else {
				System.out.println("Insufficient Balance:");
			}

		} else {
			System.out.println("enter the amount in terms of 500");
		}

	}

	@Override
	public void depositAmount(double depositeAmount) {
		System.out.println("depositedAmount is:"+depositeAmount);
		atm.setBalance(atm.getBalance()+depositeAmount);
		ministmt.put((long)depositeAmount, ":depositeAmount successfully");
		viewBalance();

	}

	@Override
	public void viewMiniStatement() {
		Set<Long>set =ministmt.keySet();
		for(long d:set) {
			System.out.println(d+""+ministmt.get(d));

		}
	}

}
