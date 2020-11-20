package mx;

import java.util.logging.Logger;

public class S02 {
	// Logger, invese di usare syso
	private static final Logger LOG = Logger.getGlobal();
	// Metto anche Java doc

	/**
	 * Calculate the average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		// Questo messaggio è per i programmatori
		LOG.info(String.format("distance is %.3f and time is %.2f", distance, time));

		// Questo non serve se uso floating point. Se commento tonera non errori
		if (time == 0.0) {// se time == 0, per chiarire usa 0.0 perchè è double
			return Double.POSITIVE_INFINITY;
		}
		double speedResult = distance / time;// meglio usare result = ...
		return speedResult;

	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	public static double distance(int x0, int y0, int x1, int y1) {
		// double xSquared = (x1 - x0) * (x1 - x0); guarda se devi convertire
		double xSquared = Math.pow((x1 - x0), 2);
		double ySquared = Math.pow((y1 - y0), 2);
		double result = Math.sqrt(xSquared + ySquared);
		return result;
	}

	/**
	 * Engine capacity
	 * 
	 * @param bore   in mm
	 * @param stroke in mm
	 * @param nr     number of cylinders
	 * @return the engine capacity in cm^3
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {
		// double boreCm = bore / 10.0; // cm
		// double strokeCm = stroke / 10.0;

		double engineDisplacement = Math.pow(bore / 2.0, 2) * Math.PI * stroke * nr;

		// conviene fare divisioni in fondo

		double result = engineDisplacement / 1000;

		return result;
	}

	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		value = Math.abs(value);
		int result = 0;

		while (value > 0) { // con != ?
			int lastNumber = value % 10;
			value /= 10;
			result += lastNumber;
		}
		return result;

		// for (; value > 0 ; value /= 10) {
		// result += value % 10;
		// }
	}

	/**
	 * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
	 *
	 * @param x
	 * @param y
	 *
	 * @return
	 */
	public static int score(double x, double y) {
		double distanceFromCenter = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		if (distanceFromCenter < 1.0) {
			return 10;
		} else if (distanceFromCenter <= 5.0) {
			return 5;
		} else if (distanceFromCenter <= 10) {
			return 1;
		} else {
			return 0;
		}

	}

}
