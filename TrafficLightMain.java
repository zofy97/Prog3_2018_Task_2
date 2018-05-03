package Main;

import Crossing.InputEventListener;
import Crossing.SensorEvent;
import Crossing.TrafficLightListener;
import User.ConsoleInput;
import User.ConsoleOutput;

/**
 * @Sophie Schauer s0559289
 * This is the main class, where most classes are initialised.
 */

public class TrafficLightMain {
	public void launch()	{
		ConsoleOutput output = new ConsoleOutput();
		ConsoleInput input = new ConsoleInput(output);
		output.setState(1);
		SensorEvent handler = new SensorEvent();
		InputEventListener l = new TrafficLightListener();
		handler.add(l);
		input.setHandler(handler);

		ConsoleInput.checkForTraffic();
	}
	public static void main(String[] args) {
			TrafficLightMain tlm = new TrafficLightMain();
			tlm.launch();
	}
}
