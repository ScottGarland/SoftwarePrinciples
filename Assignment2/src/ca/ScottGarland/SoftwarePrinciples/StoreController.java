package ca.ScottGarland.SoftwarePrinciples;

import java.util.Observable;
import java.util.Observer;

public class StoreController implements Observer {
	private Store model;
	private StoreView view;

	public StoreController(Store model, StoreView view){
		this.model = model;
		this.view = view;
	}

	public void addCustomer(Customer name){
		model.addCustomer(name);
	}
}
