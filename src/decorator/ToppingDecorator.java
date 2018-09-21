package decorator;

public abstract class ToppingDecorator implements Pizza {

	protected Pizza tempPizza;
	
	public ToppingDecorator(Pizza newPizza) {
		this.tempPizza = newPizza;
	}
	
}
