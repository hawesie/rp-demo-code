package rp.systems;

import java.io.PrintStream;

import lejos.nxt.Button;
import lejos.nxt.ButtonListener;
import lejos.nxt.comm.RConsole;

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

	protected static void redirectOutput() {
		redirectOutput(false);
	}

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
