package command;

import java.util.List;

public class TurnItAllOff implements Command{

	List<ElectronicDevice> theDevices;
	
	public TurnItAllOff(List<ElectronicDevice> newDevices) {
		theDevices = newDevices;
	}
	
	@Override
	public void execute() {
		
		for(ElectronicDevice device : this.theDevices) {
			device.off();
		}
		
	}

	@Override
	public void undo() {

		for(ElectronicDevice device : this.theDevices) {
			device.on();
		}
		
	}

}
