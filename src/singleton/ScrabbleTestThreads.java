package singleton;

public class ScrabbleTestThreads {

	public static void main(String[] args) {

		Runnable getTiles1 = new GetTheTiles();
		Runnable getTiles2 = new GetTheTiles();

		new Thread(getTiles1).start();
		new Thread(getTiles2).start();

	}

}
