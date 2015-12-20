package homework08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValletParking<T extends Vehicle> {

	private int numberOfSpots;
	// private ArrayList<ParkingTicket> spots = new ArrayList<>(numberOfSpots);
	private Map<ParkingTicket, T> spots = new HashMap<>(numberOfSpots);

	// for every new ValetParking object you must define initial number of
	// available slots.
	public ValletParking(int numberOfSpots) {
		this.numberOfSpots = numberOfSpots;
		createTickets();
	}

	private void createTickets() {
		for (int i = 0; i < numberOfSpots; i++) {
			spots.put(new ParkingTicket(i), null);
		}
	}

	public ParkingTicket parkVehicle(T vehicle) {
		ParkingTicket ticket = findFirstEmptySpot();
		if (ticket == null) {
			System.out.println("Parking lot is full. Please try again later!");
			return null;
		}
		spots.put(ticket, vehicle);
		ticket.park();
		vehicle.start();
		vehicle.drive(ticket.getDistanceToParkingSpot());
		vehicle.stop();
		return ticket;
	}

	public T retrieveVehicle(ParkingTicket ticket) {
		T vehicle = spots.get(ticket);
		ticket.unPark();
		vehicle.start();
		vehicle.drive(ticket.getDistanceToParkingSpot());
		vehicle.stop();
		return vehicle;
		

	}

	/*
	 * private ParkingTicket findFirstEmptySpot() {
	 * 
	 * if (spots.size() < numberOfSpots) { return new
	 * ParkingTicket(spots.size()); } else { throw new ParkingLotFullException(
	 * "Parking lot is full. Please try again later!"); } }
	 */

	public ParkingTicket findFirstEmptySpot() {
		ParkingTicket emptySpot = null;
		Iterator<ParkingTicket> itr = spots.keySet().iterator();
		// boolean foundEmptySpot = false;
		while (itr.hasNext()) {
			emptySpot = itr.next();
			if (!emptySpot.isOccupied()) {
				return emptySpot;
				// foundEmptySpot = true;
			}
		}
		return null;
	}

}
