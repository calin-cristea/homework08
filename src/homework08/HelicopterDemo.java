package homework08;

public class HelicopterDemo extends Helicopter {

	public HelicopterDemo(float fuelAmount) {
		setFuelTankSize(500f);
		setFuelType("PETROL");
		setFuelUM("l");
		setFuelConsumedPer100Km(32.5f);
		setCurrentAmountOfFuel(fuelAmount);
		setChassisNumber("12544heli");
	}

}
