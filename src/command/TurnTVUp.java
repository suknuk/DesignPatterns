package command;

public class TurnTVUp implements Command{

	ElectronicDevice theDevice;
	
	public TurnTVUp(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		this.theDevice.volumeUp();
	}

	@Override
	public void undo() {
		this.theDevice.volumeDown();
	}

}