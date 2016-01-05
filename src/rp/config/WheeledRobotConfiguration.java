package rp.config;

import lejos.geom.Line;
import lejos.robotics.RegulatedMotor;
import rp.robotics.mapping.MapUtils;

/**
 * A class to store configuration information for a wheeled robot. You could
 * subclass this to also contain information about sensor ports.
 * 
 * @author Nick
 * 
 */
public class WheeledRobotConfiguration implements WheeledRobotDescription {

	private final double m_wheelDiameter;
	private final double m_trackWidth;
	private final double m_robotLength;
	private final RegulatedMotor m_leftWheel;
	private final RegulatedMotor m_rightWheel;

	private final Line[] m_footprint;

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

		// assuming pose 0,0,0 is in the middle of the robot, these lines define
		// the footprint of the robot. We'll start with a square based on track
		// width and robot length. These are done in relative coordinates to the
		// robot centre.

		m_footprint = new Line[4];
		MapUtils.createBox((float) -m_robotLength / 2,
				(float) m_trackWidth / 2, (float) m_robotLength / 2,
				(float) -m_trackWidth / 2, false).toArray(m_footprint);

	}

}
