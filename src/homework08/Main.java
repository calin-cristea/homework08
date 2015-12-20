package homework08;

public class Main {

	public static void main(String[] args) {
		
		ValletParking<Car> carPark = new ValletParking<Car>(10);
		
		Car car = new Mondeo(45, "hik65454");
		float amountOfFuelBeforeParking = car.getCurrentAmountOfFuel();
		ParkingTicket ticket = carPark.parkVehicle(car);
		car = carPark.retrieveVehicle(ticket);
		float amountOfFuelAfterParking = car.getCurrentAmountOfFuel();
		
		//ValletParking<Helicopter> carPark = new ValletParking<Helicopter>();

		//ValletParking<Motorcycle> carPark = new ValletParking<Motorcycle>();

	}

}
