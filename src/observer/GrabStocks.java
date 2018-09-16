package observer;

public class GrabStocks {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLEPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(196.51);
		stockGrabber.setAAPLEPrice(678.90);
		stockGrabber.setGOOGPrice(671.23);
		
		// delete observer1 - does no longer receive updates
		stockGrabber.unregister(observer1);
		
		stockGrabber.setIBMPrice(196.51);
		stockGrabber.setAAPLEPrice(678.90);
		stockGrabber.setGOOGPrice(671.23);

	}

}
