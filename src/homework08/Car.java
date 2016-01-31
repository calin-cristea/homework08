package homework08;

public abstract class Car implements Vehicle {

	protected String brandDescription;
	protected float fuelTankSize;
	protected String fuelType;
	protected int numberOfGears;
	// MU = l/100 km
	protected float fuelConsumedPer100Km;
	// MU = g/km
	protected float pollutionPerKm;

	private float fuelAmount;
	private String chassisNumber;

	protected Float[] gearConsumptions;
	protected int currentGear;

	protected float fuelConsumed;
	protected float distanceDriven;

	@Override
	public void start() {
		fuelConsumed = 0;
		// this also resets the current pollution.
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
	public void drive(float km) throws NoFuelException {
		fuelConsumed += gearConsumptions[currentGear - 1] * km / 100;
		distanceDriven += km;
		if (fuelConsumed >= fuelAmount) {
			throw new NoFuelException("Dear pilot your tank is empty!!!");
		}
	}

	@Override
	public void stop() {
		fuelAmount -= fuelConsumed;
		System.out.println("You have driven " + distanceDriven + " km.");
		System.out.println("You have consumed " + fuelConsumed + " fuel");
	}

	public void setCurrentAmountOfFuel(float fuelAmount) {
		this.fuelAmount = fuelAmount;
	}

	// get current amount of fuel
	public float getCurrentAmountOfFuel() {
		return fuelAmount;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public float getAverageFuelConsumption() {
		return fuelConsumed * 100 / distanceDriven;
	}

	public float getPollution() {
		return distanceDriven * pollutionPerKm;
	}

	public String getBrandDescription() {
		return brandDescription;
	}

	public float getFuelConsumedPer100Km() {
		return fuelConsumedPer100Km;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chassisNumber == null) ? 0 : chassisNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (chassisNumber == null) {
			if (other.chassisNumber != null)
				return false;
		} else if (!chassisNumber.equals(other.chassisNumber))
			return false;
		return true;
	}
}