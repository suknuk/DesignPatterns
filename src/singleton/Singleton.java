package singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

	private static Singleton firstInstance = null;

	String[] letters = { "a", "a", "b", "c", "d", "e" };

	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(letters));

	static boolean firstThread = true;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (firstInstance == null) {

			if (firstThread) {
				firstThread = false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			synchronized (Singleton.class) {
				if (firstInstance == null) {
					firstInstance = new Singleton();
				}
			}

		}
		return firstInstance;

	}

	public LinkedList<String> getLetterList() {
		return firstInstance.letterList;
	}

	public LinkedList<String> getTiles(int howManyTiles) {
		Collections.shuffle(firstInstance.letterList);

		LinkedList<String> tilesToSend = new LinkedList<String>();
		for (int i = 0; i < howManyTiles; i++) {
			tilesToSend.add(firstInstance.letterList.remove(0));
		}
		return tilesToSend;
	}
}
