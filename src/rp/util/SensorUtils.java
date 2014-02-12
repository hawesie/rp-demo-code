package rp.util;

import java.util.Hashtable;

/**
 * 
 * Utility functions to make using certain sensors easier.
 * 
 * @author Nick Hawes
 *
 */
public abstract class SensorUtils {

	public static final Hashtable<Integer, String> COLOUR_NAMES;

	static {
		COLOUR_NAMES = new Hashtable<Integer, String>();
		COLOUR_NAMES.put(0, "black");
		COLOUR_NAMES.put(1, "violet");
		COLOUR_NAMES.put(2, "purple");
		COLOUR_NAMES.put(3, "blue");
		COLOUR_NAMES.put(4, "green");
		COLOUR_NAMES.put(5, "lime");
		COLOUR_NAMES.put(6, "yellow");
		COLOUR_NAMES.put(7, "orange");
		COLOUR_NAMES.put(8, "red");
		COLOUR_NAMES.put(9, "crimson");
		COLOUR_NAMES.put(10, "magenta");
		COLOUR_NAMES.put(11, "pastel");
		COLOUR_NAMES.put(12, "pastel");
		COLOUR_NAMES.put(13, "pastel");
		COLOUR_NAMES.put(14, "pastel");
		COLOUR_NAMES.put(15, "pastel");
		COLOUR_NAMES.put(16, "pastel");
		COLOUR_NAMES.put(17, "white");
	}

	public static String toColourName(int _colourNumber) {
		return COLOUR_NAMES.get(_colourNumber);
	}

}
