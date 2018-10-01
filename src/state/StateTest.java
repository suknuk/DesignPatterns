package state;

public class StateTest {

	public static void main(String[] args) {
		Girlfriend gf = new Girlfriend();
		
		// Neutral
		gf.talk();
		gf.annoy();
		// Now angry
		gf.talk();
		gf.talk();
		gf.kiss();
		// Now Neutral
		gf.kiss();
		// Now Happy
		gf.talk();

	}

}
