package homework08;

public abstract class Helicopter implements Vehicle {

	private float fuelTankSize;
	private String fuelType;
	private String fuelUM;
	private float fuelConsumedPer100Km;
	private float fuelAmount;
	private String chassisNumber;

	private float fuelConsumed;
	private float distanceDriven;

	@Override
	public void start() {
		fuelConsumed = 0;
		distanceDriven = 0;
	}

	@Override
	public void drive(float km) {
		fuelConsumed += fuelConsumedPer100Km / 100 * km;
		distanceDriven += km;
		if (fuelConsumed >= fuelAmount) {
			System.out.println("Dear pilot your tank is empty!!!");
			throw new RuntimeException();
		}
	}

	@Override
	public void stop() {
		fuelAmount -= fuelConsumed;
		System.out.println("You have driven " + distanceDriven + " km.");
		System.out.println("You have consumed " + fuelConsumed + " " + fuelUM + " " + fuelType);
	}
	
	public void setCurrentAmountOfFuel(float fuelAmount) {
		this.fuelAmount = fuelAmount;
	}

	public float getCurrentAmountOfFuel() {
		return fuelAmount;
	}

	public void setFuelTankSize(float fuelTankSize) {
		this.fuelTankSize = fuelTankSize;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setFuelUM(String fuelUM) {
		this.fuelUM = fuelUM;
	}

	public void setFuelConsumedPer100Km(float fuelConsumedPer100Km) {
		this.fuelConsumedPer100Km = fuelConsumedPer100Km;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

}
