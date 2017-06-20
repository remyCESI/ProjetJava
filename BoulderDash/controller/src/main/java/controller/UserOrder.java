package controller;

public class UserOrder implements IUserOrder{

	private Order order;
	
	public UserOrder(Order order) {
		
	}
	
	public Order getOrder() {
		return order;
	}
}

