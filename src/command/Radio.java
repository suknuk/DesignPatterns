package command;

public class Radio implements ElectronicDevice {

	private int volume = 0;
	
	@Override
	public void on() {
		System.out.println("Radio is ON");
	}

	@Override
	public void off() {
		System.out.println("Radio is OFF");
	}

	@Override
	public void volumeUp() {
		this.volume++;
		System.out.println("Radio volume is at " + this.volume);
	}

	@Override
	public void volumeDown() {
		this.volume--;
		System.out.println("Radio volume is at " + this.volume);
	}
	
}
