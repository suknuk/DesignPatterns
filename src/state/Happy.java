package state;

public class Happy implements State {

	private Girlfriend girlfriend;

	public Happy(Girlfriend girlfriend) {
		this.girlfriend = girlfriend;
	}

	@Override
	public void talk() {
		System.out.println("I am feeling really good!");
	}

	@Override
	public void kiss() {
		System.out.println("Hehe :-)");
	}

	@Override
	public void annoy() {
		System.out.println("Are you crazy? :-[");
		this.girlfriend.setNewState(new Angry(this.girlfriend));
	}

}
