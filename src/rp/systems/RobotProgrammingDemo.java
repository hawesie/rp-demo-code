package rp.systems;

import java.io.PrintStream;

import lejos.nxt.Button;
import lejos.nxt.ButtonListener;
import lejos.nxt.comm.RConsole;

/**
 * A class which can be sub-classed to create a class with a run method. This is
 * supported by the m_run boolean variable which is true until the escape button
 * is pressed.
 * 
 * 
 * @author Nick Hawes
 * 
 */
public abstract class RobotProgrammingDemo implements Runnable {

	protected boolean m_run = true;

	public RobotProgrammingDemo() {
		Button.ESCAPE.addButtonListener(new ButtonListener() {

			@Override
			public void buttonReleased(Button _b) {
				m_run = false;
			}

			@Override
			public void buttonPressed(Button _b) {

			}
		});
	}

	/**
	 * Configure leJOS to redirect calls to System.out.println to RConsole via
	 * USB.
	 */
	protected static void redirectOutput() {

		redirectOutput(false);
	}

	/**
	 * Configure leJOS to redirect calls to System.out.println to RConsole via
	 * either Bluetooth (_useBluetooth = true) or USB (_useBluetooth = false).
	 */
	protected static void redirectOutput(boolean _useBluetooth) {
		if (!RConsole.isOpen()) {
			if (_useBluetooth) {
				RConsole.openBluetooth(0);
			} else {
				RConsole.openUSB(0);
			}
		}
		PrintStream ps = RConsole.getPrintStream();
		System.setOut(ps);
		System.setErr(ps);
	}

}
