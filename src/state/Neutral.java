package state;

public class Neutral implements State {

	private Girlfriend girlfriend;

	public Neutral(Girlfriend girlfriend) {
		this.girlfriend = girlfriend;
	}

	@Override
	public void talk() {
		System.out.println("Hello!");
	}

	@Override
	public void kiss() {
		System.out.println("Hehe :-)");
		this.girlfriend.setNewState(new Happy(this.girlfriend));
	}

	@Override
	public void annoy() {
		System.out.println("Are you crazy? I'm angry!");
		this.girlfriend.setNewState(new Angry(this.girlfriend));
	}

}
