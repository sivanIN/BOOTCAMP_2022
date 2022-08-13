package day5Assignment4;

import java.util.ArrayList;
import java.util.Iterator;

import day5.Employee;

public class CabCustomerService {

	private ArrayList<CabCustomer> cabCustomer_list = new ArrayList<CabCustomer>(); 

	public void addCabCustomer(CabCustomer cabCustomer) {

		cabCustomer_list.add(cabCustomer);


	}

	public boolean isFirstCustomer(CabCustomer cabCustomer) {

		Iterator<CabCustomer> iterator = cabCustomer_list.iterator();

		while(iterator.hasNext()){
			CabCustomer i = iterator.next();
			if(i.getPhone() == cabCustomer.getPhone()) {
				return false;
			}
		}

		addCabCustomer(cabCustomer);
		return true;
	}

	private double calculateBill(CabCustomer cabCustomer) {
		if(isFirstCustomer(cabCustomer)) {
			return 0.0;
		}
		else if(cabCustomer.getDistance() <= 4) {
			return 80.00;
		}
		else if(cabCustomer.getDistance() > 4) {
			double amount ;
			amount = 80.0 + 6 * (cabCustomer.getDistance() - 4);
			return amount;
		}
		return 0;
	}

	public String printBill(CabCustomer cabCustomer) {
		return cabCustomer.getCustomerName() + " Please pay your bill of Rs " + calculateBill(cabCustomer);
	}



}
