package homework08;

public class Main {

	public static void main(String[] args) {
		
		ValletParking<Car> carPark = new ValletParking<Car>();

		Car car = new Mondeo(45, "hik65454");// car has drive and getCurrentAmountOfFuel
								// methods.

		float amountOfFuelBeforeParking = car.getAvailableFuel();

		ParkingTicket ticket = carPark.parkVehicle(car); // the vallet gives you
															// ticket and drives
															// your car to an
															// empty spot. That
															// could be on the
															// 5th floor of the
															// parking lot.

		// eat pizza, don't drink alcohol

		car = carPark.retrieveVehicle(ticket); // the vallet checks your ticket
												// and finds your car according
												// to it, and drives it back to
												// you.

		float amountOfFuelAfterParking = car.getAvailableFuel();

	}

}
