package rp.config;

import lejos.nxt.Motor;

/***
 * Configuration information useful for specific robot applications
 * 
 * @author Nick Hawes
 *
 */
public class RobotConfigs {

	/***
	 * Width of the image used in the NXTCam
	 */
	public final static int NXTCAM_IMAGE_WIDTH = 176;

	/***
	 * Height of the image used in the NXTCam
	 */
	public final static int NXTCAM_IMAGE_HEIGHT = 144;

	
	/**
	 * Configuration for Nick's Expressbot build. The numbers may be different for you. Measurements in mm. 
	 */
	public static final WheeledRobotConfiguration EXPRESS_BOT = new WheeledRobotConfiguration(
			56, 163, 210, Motor.A, Motor.C);

	/**
	 * Configuration for Nick's Castorbot build. The numbers may be different for you. Measurements in mm. 
	 */
	public static final WheeledRobotConfiguration CASTOR_BOT = new WheeledRobotConfiguration(
			56, 120, 230, Motor.C, Motor.A);

	
}
