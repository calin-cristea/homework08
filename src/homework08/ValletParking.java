package homework08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * The Class ValletParking.
 *
 * @param <T> the generic type, must be a vehicle.
 */
public class ValletParking<T extends Vehicle> {

	private int numberOfSpots;
	
	private Map<ParkingTicket, T> spots = new HashMap<>(numberOfSpots);

	/**
	 * Instantiates a new Valet parking.
	 *
	 * @param numberOfSpots the number of spots. This must be passed in order to generate all possible spots.
	 */
	public ValletParking(int numberOfSpots) {
		this.numberOfSpots = numberOfSpots;
		createTickets();
	}

	private void createTickets() {
		for (int i = 0; i < numberOfSpots; i++) {
			spots.put(new ParkingTicket(i), null);
		}
	}

	/**
	 * Park vehicle.
	 *
	 * @param vehicle the vehicle
	 * @return the parking ticket
	 */
	public ParkingTicket parkVehicle(T vehicle) {
		ParkingTicket ticket = findFirstEmptySpot();
		if (ticket == null) {
			System.out.println("Parking lot is full. Please try again later!");
			return null;
		}
		vehicle.start();
		try {
			vehicle.drive(ticket.getDistanceToParkingSpot());
		} catch (NoFuelException e) {
			System.out.println(e.getMessage());
		}
		vehicle.stop();
		spots.put(ticket, vehicle);
		ticket.park();
		return ticket;
	}

	/**
	 * Retrieve vehicle.
	 *
	 * @param ticket the parking ticket assigned at park
	 * @return the vehicle parked
	 */
	public T retrieveVehicle(ParkingTicket ticket) {
		if(ticket == null) {
			System.out.println("Your vehicle is not parked here!!!");
			return null;
		}
		T vehicle = spots.get(ticket);
		ticket.unPark();
		vehicle.start();
		try {
			vehicle.drive(ticket.getDistanceToParkingSpot());
		} catch (NoFuelException e) {
			System.out.println(e.getMessage());
		}
		vehicle.stop();
		return vehicle;

	}

	private ParkingTicket findFirstEmptySpot() {
		ParkingTicket emptySpot = null;
		Iterator<ParkingTicket> itr = spots.keySet().iterator();
		while (itr.hasNext()) {
			emptySpot = itr.next();
			if (!emptySpot.isOccupied()) {
				return emptySpot;
			}
		}
		return null;
	}

}
