package homework08;

public class Mondeo extends Ford {
	public Mondeo(float fuelAmount, String chassisNumber) {
		fuelTankSize = 70;
		fuelType = "DIESEL";
		gearNo = 6;
		fuelConsumedPer100Km = 7.0f;
		pollutionPerKm = 139;
		setAvailableFuel(fuelAmount);
		setChassisNumber(chassisNumber);
		gearConsumptions = new Float[] {10.1f, 9.1f, 8.1f, 7.1f, 6.1f};
	}
}
