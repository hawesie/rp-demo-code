package rp.systems;

import lejos.robotics.navigation.DifferentialPilot;
import rp.config.WheeledRobotConfiguration;

/**
 * 
 * A class to provide methods to control a wheeled robot system. Also provides
 * access to the underlying configuration for convenience.
 * 
 * @author Nick Hawes
 * 
 */
public class WheeledRobotSystem {

	private final WheeledRobotConfiguration m_config;
	private DifferentialPilot m_differentialPilot;

	public WheeledRobotSystem(WheeledRobotConfiguration _config) {
		m_config = _config;
	}

	/**
	 * Get the DifferentialPilot for this robot. This creates a singleton
	 * object, so subsequent calls to this method return the same object.
	 * 
	 * @return
	 */
	public DifferentialPilot getPilot() {
		if (m_differentialPilot == null) {
			m_differentialPilot = new DifferentialPilot(
					m_config.getWheelDiameter(), m_config.getTrackWidth(),
					m_config.getLeftWheel(), m_config.getRightWheel());
		}
		return m_differentialPilot;
	}

	/*
	 * Get configuration information for this robot.
	 * @return
	 */
	public WheeledRobotConfiguration getConfig() {
		return m_config;
	}

}
