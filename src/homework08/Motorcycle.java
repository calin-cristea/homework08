package homework08;

public abstract class Motorcycle implements Vehicle {

	private float fuelTankSize;
	private String fuelType;
	private String fuelUM;
	private int numberOfGears;
	private float fuelConsumedPer100Km;
	private float fuelAmount;
	private String chassisNumber;
	private Float[] gearConsumptions;

	private int currentGear;
	private float fuelConsumed;
	private float distanceDriven;

	@Override
	public void start() {
		fuelConsumed = 0;
		distanceDriven = 0;
		if (currentGear > 1) {
			System.out.println("Yor gear is " + currentGear + ". You can't start the engine with gear bigger than 1");
			throw new RuntimeException();
		}
		currentGear = 1;
	}
	
	public void shiftGear(int gear) {
		if (gear > numberOfGears) {
			System.out.println("You entered a gear greater than " + numberOfGears);
			throw new RuntimeException();
		}
		currentGear = gear;
		System.out.println("You switched to " + currentGear + " gear.");
	}

	@Override
	public void drive(float km) {
		fuelConsumed += gearConsumptions[currentGear - 1] / 100 * km;
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

	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}

	public void setFuelConsumedPer100Km(float fuelConsumedPer100Km) {
		this.fuelConsumedPer100Km = fuelConsumedPer100Km;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public void setGearConsumptions(Float[] gearConsumptions) {
		this.gearConsumptions = gearConsumptions;
	}

}
