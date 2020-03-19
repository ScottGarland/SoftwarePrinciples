package ca.ScottGarland.SoftwarePrinciples;

import java.util.ArrayList;
import java.util.Observable;

public class Store extends Observable {

	private String name;
	private ArrayList<Customer>	customersStore;
	
	public Store(String name) {
		this.name = name;
		customersStore = new ArrayList<Customer>();
	}

	public void addCustomer(Customer customer) {
		customersStore.add(customer);
	}
	
	public boolean removeCustomer(Customer customer) {
		return customersStore.remove(customer);
	}
	
	public String getName() {
		return this.name;
	}

	public ArrayList<Customer>	getCustomers() {
		return this.customersStore;
	}
}