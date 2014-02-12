package rp.config;

import lejos.nxt.Motor;

public class RobotConfigs {

	public final static int NXTCAM_IMAGE_WIDTH = 176;

	public final static int NXTCAM_IMAGE_HEIGHT = 144;

	public static final WheeledRobotConfiguration EXPRESS_BOT = new WheeledRobotConfiguration(
			56, 163, 240, Motor.C, Motor.A);


	public static final WheeledRobotConfiguration CASTOR_BOT = new WheeledRobotConfiguration(
			56, 120, 230, Motor.C, Motor.A);

	
}
