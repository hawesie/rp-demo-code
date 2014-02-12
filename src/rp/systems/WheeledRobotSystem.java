package rp.systems;

import lejos.robotics.RegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;
import rp.config.WheeledRobotConfiguration;

public class WheeledRobotSystem  {

	private final WheeledRobotConfiguration m_config;
	private DifferentialPilot m_differentialPilot;

	public WheeledRobotSystem(WheeledRobotConfiguration _config) {
		m_config = _config;
	}

	public DifferentialPilot getPilot() {
		if (m_differentialPilot == null) {
			m_differentialPilot = new DifferentialPilot(
					m_config.getWheelDiameter(), m_config.getTrackWidth(),
					m_config.getLeftWheel(), m_config.getRightWheel());
		}
		return m_differentialPilot;
	}

	public double getWheelDiameter() {
		return m_config.getWheelDiameter();
	}

	public double getTrackWidth() {
		return m_config.getTrackWidth();
	}

	public RegulatedMotor getLeftWheel() {
		return m_config.getLeftWheel();
	}

	public RegulatedMotor getRightWheel() {
		return m_config.getRightWheel();
	}

	public double getRobotLength() {
		return m_config.getRobotLength();
	}
	
}
