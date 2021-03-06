package command;

public class TurnTVOff implements Command{

	ElectronicDevice theDevice;
	
	public TurnTVOff(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		this.theDevice.off();
	}

	@Override
	public void undo() {
		this.theDevice.on();
	}

}
