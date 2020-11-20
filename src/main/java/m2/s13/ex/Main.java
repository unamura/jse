package m2.s13.ex;

public class Main {
	public static void main(String[] args) {
		Vehicle[] vehicles = { new Car(), new Bus(), new MotorBike() };// posso mettere solo veicoli, il flat NO

		boolean rightDirection = true;
		for (Vehicle vehicle : vehicles) {
			vehicle.steer(rightDirection);
			rightDirection = !rightDirection;// nego ogni volta, true--false--true--...
		}

		Conditioning[] conditionings = { new Bus(), new Car(), new Flat() };// ho tutti oggetti condizionabili, anche
																			// flat. Oggetti istanze di classe che
																			// implementano conditioning. QUindi non potrò inserirci MotorBike

		int temperature = 20;
		for (Conditioning conditioning : conditionings) {
			conditioning.setTemperature(temperature);//set Temperature vien dal conditioning, quindi si puo fare
			temperature += 1;
		}
	}
}
