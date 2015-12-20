package homework08;

public class Boxster extends Porsche {
	public Boxster(float fuelAmount, String chassisNumber) {
		// kWh
		fuelTankSize = 29;
		fuelType = "ELECTRIC";
		gearNo = 4;
		// kWh/100 km 
		fuelConsumedPer100Km = 10.4f;
		pollutionPerKm = 0;
		setAvailableFuel(fuelAmount);
		setChassisNumber(chassisNumber);
		gearConsumptions = new Float[] {6.1f, 5.6f, 5.1f, 4.6f, 4.1f};
	}
}
