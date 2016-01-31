package homework08;

public class Main {

	public static void main(String[] args) {

		ValletParking<Car> carPark = new ValletParking<Car>(10);
		Car car = new Mondeo(45, "hik65454");
		float amountOfFuelBeforeParking = car.getCurrentAmountOfFuel();
		ParkingTicket ticket = carPark.parkVehicle(car);
		car = carPark.retrieveVehicle(ticket);
		float amountOfFuelAfterParking = car.getCurrentAmountOfFuel();

		System.out.println("Amount of fuel before parking: " + amountOfFuelBeforeParking);
		System.out.println("Amount of fuel after parking: " + amountOfFuelAfterParking);

		ValletParking<Helicopter> helicopterPark = new ValletParking<Helicopter>(3);
		Helicopter helicopter = new HelicopterDemo(100f);
		amountOfFuelBeforeParking = helicopter.getCurrentAmountOfFuel();
		ticket = helicopterPark.parkVehicle(helicopter);
		helicopter = helicopterPark.retrieveVehicle(ticket);
		amountOfFuelAfterParking = helicopter.getCurrentAmountOfFuel();

		System.out.println("Amount of fuel before parking: " + amountOfFuelBeforeParking);
		System.out.println("Amount of fuel after parking: " + amountOfFuelAfterParking);

		ValletParking<Motorcycle> motorcyclePark = new ValletParking<Motorcycle>(20);
		Motorcycle motorcycle = new MotorcycleDemo(10);
		amountOfFuelBeforeParking = motorcycle.getCurrentAmountOfFuel();
		ticket = motorcyclePark.parkVehicle(motorcycle);
		motorcycle = motorcyclePark.retrieveVehicle(ticket);
		amountOfFuelAfterParking = motorcycle.getCurrentAmountOfFuel();

		System.out.println("Amount of fuel before parking: " + amountOfFuelBeforeParking);
		System.out.println("Amount of fuel after parking: " + amountOfFuelAfterParking);

	}

}
