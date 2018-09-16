package observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {

		this.observers.add(newObserver);

	}

	@Override
	public void unregister(Observer deleteObserver) {

		int observerIndex = this.observers.indexOf(deleteObserver);
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		this.observers.remove(observerIndex);

	}

	@Override
	public void notifyObserver() {

		for (Observer observer : this.observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}

	}

	public void setIBMPrice(double newIBMPrice) {
		this.ibmPrice = newIBMPrice;
		this.notifyObserver();
	}

	public void setAAPLEPrice(double newAAPLPrice) {
		this.aaplPrice = newAAPLPrice;
		this.notifyObserver();
	}

	public void setGOOGPrice(double newGOOGPrice) {
		this.googPrice = newGOOGPrice;
		this.notifyObserver();
	}

}
