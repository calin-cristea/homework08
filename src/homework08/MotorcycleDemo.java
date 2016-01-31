package homework08;

public class MotorcycleDemo extends Motorcycle {
	
	public MotorcycleDemo (float fuelAmount) {
		setFuelTankSize(15f);
		setFuelType("PETROL");
		setFuelUM("l");
		setNumberOfGears(4);
		setFuelConsumedPer100Km(5.6f);
		setCurrentAmountOfFuel(10f);
		setChassisNumber("444445moto");
		setGearConsumptions(new Float[] {6.1f, 5.9f, 5.6f, 5.1f});
	}

}
