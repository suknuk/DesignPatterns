package command;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

	public static void main(String[] args) {
		
		ElectronicDevice newDevice = TVRemote.getDevice();
		
		Command onCommand = new TurnTVOn(newDevice);
		DeviceButton onPressed = new DeviceButton(onCommand);
		onPressed.press();
		
		Command offCommand = new TurnTVOff(newDevice);
		DeviceButton offPressed = new DeviceButton(offCommand);
		offPressed.press();
		
		Command upCommand = new TurnTVUp(newDevice);
		DeviceButton upPressed = new DeviceButton(upCommand);
		upPressed.press();
		upPressed.press();
		upPressed.press();
		
		// -----
		Television theTV = new Television();
		Radio theRadio = new Radio();
		
		List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
		allDevices.add(theTV);
		allDevices.add(theRadio);
		
		Command turnOffDevices = new TurnItAllOff(allDevices);
		
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		turnThemOff.press();
		
		// -----
		turnThemOff.pressUndo();
		
	}

}
