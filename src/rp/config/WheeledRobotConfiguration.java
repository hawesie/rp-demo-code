package rp.config;

import lejos.robotics.RegulatedMotor;

/**
 * A class to store configuration information for a wheeled robot. You could
 * subclass this to also contain information about sensor ports.
 * 
 * @author Nick
 * 
 */
public class WheeledRobotConfiguration {

	private final double m_wheelDiameter;
	private final double m_trackWidth;
	private final double m_robotLength;
	private final RegulatedMotor m_leftWheel;
	private final RegulatedMotor m_rightWheel;

	public double getWheelDiameter() {
		return m_wheelDiameter;
	}

	public double getTrackWidth() {
		return m_trackWidth;
	}

	public RegulatedMotor getLeftWheel() {
		return m_leftWheel;
	}

	public RegulatedMotor getRightWheel() {
		return m_rightWheel;
	}

	public double getRobotLength() {
		return m_robotLength;
	}

	public WheeledRobotConfiguration(double _wheelDiameter, double _trackWidth,
			double _robotLength, RegulatedMotor _leftWheel,
			RegulatedMotor _rightWheel) {
		super();
		m_wheelDiameter = _wheelDiameter;
		m_trackWidth = _trackWidth;
		m_robotLength = _robotLength;
		m_leftWheel = _leftWheel;
		m_rightWheel = _rightWheel;
	}

}
