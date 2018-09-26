package command;

public class Television implements ElectronicDevice {

	private int volume = 0;
	
	@Override
	public void on() {
		System.out.println("TV is ON");
	}

	@Override
	public void off() {
		System.out.println("TV is OFF");
	}

	@Override
	public void volumeUp() {
		this.volume++;
		System.out.println("TV volume is at " + this.volume);
	}

	@Override
	public void volumeDown() {
		this.volume--;
		System.out.println("TV volume is at " + this.volume);
	}
	

}
