package rp.config;

import lejos.robotics.RegulatedMotor;

public interface WheeledRobotDescription {
	public double getWheelDiameter();

	public double getTrackWidth();

	public RegulatedMotor getLeftWheel();

	public RegulatedMotor getRightWheel();

	public double getRobotLength();
}
