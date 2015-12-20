package homework08;

public class Carrera extends Porsche {
	public Carrera(float fuelAmount, String chassisNumber) {
		fuelTankSize = 64;
		fuelType = "PETROL";
		gearNo = 5;
		fuelConsumedPer100Km = 8.3f;
		pollutionPerKm = 190;
		setAvailableFuel(fuelAmount);
		setChassisNumber(chassisNumber);
		gearConsumptions = new Float[] {12.1f, 11.1f, 10.1f, 9.1f, 8.1f};
	}
}
