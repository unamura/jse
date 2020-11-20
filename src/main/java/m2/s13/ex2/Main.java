package m2.s13.ex2;

public class Main {
	public static void main(String[] args) {
		// car -> steer
		// boat -> move
		// amph -> steer and move

		Guide[] earthVehicles = { new Car(), new Amphibian() };
		Navigate[] seaVehicles = { new Boat(), new Amphibian() };

		boolean rightDirection = true;

		for (Guide vehicle : earthVehicles) {
			vehicle.steer(rightDirection);
			rightDirection = !rightDirection;
		}
		
		boolean leftDirection = false;
		for (Navigate vehicle : seaVehicles) {
			vehicle.move(leftDirection);
			leftDirection = !leftDirection;
		}



	}

}
