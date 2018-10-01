package state;

public class Girlfriend {

	private State currentState;

	public Girlfriend() {
		this.currentState = new Neutral(this);
	}

	public void setNewState(State state) {
		this.currentState = state;
	}

	public void talk() {
		this.currentState.talk();
	}

	public void kiss() {
		this.currentState.kiss();
	}

	public void annoy() {
		this.currentState.annoy();
	}

}
