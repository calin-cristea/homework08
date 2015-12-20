package homework08;

public class Fiesta extends Ford {
	public Fiesta(float fuelAmount, String chassisNumber) {
		fuelTankSize = 47;
		fuelType = "PETROL";
		gearNo = 5;
		fuelConsumedPer100Km = 6.0f;
		pollutionPerKm = 119;
		setAvailableFuel(fuelAmount);
		setChassisNumber(chassisNumber);
		gearConsumptions = new Float[] {9.1f, 8.1f, 7.1f, 6.1f, 5.1f};
	}
}
