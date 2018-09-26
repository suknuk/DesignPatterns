package command;

public class DeviceButton {

	Command theCommand;
	
	public DeviceButton(Command newCommand) {
		this.theCommand = newCommand;
	}
	
	public void press() {
		this.theCommand.execute();
	}
	
	public void pressUndo() {
		this.theCommand.undo();
	}
}
