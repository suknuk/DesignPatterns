package state;

public class Angry implements State {

	private Girlfriend girlfriend;

	public Angry(Girlfriend girlfriend) {
		this.girlfriend = girlfriend;
	}

	@Override
	public void talk() {
		System.out.println("I want to go home now.");
	}

	@Override
	public void kiss() {
		System.out.println("Alright. I like you again.");
		this.girlfriend.setNewState(new Neutral(this.girlfriend));
	}

	@Override
	public void annoy() {
		System.out.println("You are only making it worse!");
	}

}
