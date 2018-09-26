package command;

public class TurnTVOn implements Command{

	ElectronicDevice theDevice;
	
	public TurnTVOn(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		this.theDevice.on();
	}

	@Override
	public void undo() {
		this.theDevice.off();
	}

}
