package homework08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValletParking<T extends Vehicle> {

	private int numberOfSpots;
	private ArrayList<ParkingTicket> spots = new ArrayList<>(numberOfSpots);
	//private Map<ParkingTicket, T> spots = new HashMap<>(numberOfSpots);

	// for every new ValetParking object you must define initial number of
	// available slots.
	public ValletParking(int numberOfSpots) {
		this.numberOfSpots = numberOfSpots;
		createSpots();
	}

	private void createSpots() {
		for (int i = 0; i < numberOfSpots; i++) {
			spots.add(new ParkingTicket(i));
		}
	}

	public ParkingTicket parkVehicle(T vehicle) {
		ParkingTicket ticket = findFirstEmptySpot();
		if (ticket != null) {
			spots.add(ticket);
			ticket.park();
			vehicle.start();
			vehicle.drive(ticket.getDistanceToParkingSpot());
			vehicle.stop();
		}
		System.out.println("Parking lot is full. Please try again later!");
		return ticket;
	}

	public T retrieveVehicle(ParkingTicket ticket) {
		/*int i = spots.indexOf(ticket);
		spots.get(i);
		// must return a vehicle*/
		return null;

	}

	public ParkingTicket findFirstEmptySpot() {
		ParkingTicket emptySpot = null;
		Iterator<ParkingTicket> itr = spots.iterator();
		boolean foundEmptySpot = false;
		while (itr.hasNext() && !foundEmptySpot) {
			emptySpot = itr.next();
			if (emptySpot.getOccupiedState()) {
				foundEmptySpot = true;
			}
		}
		return emptySpot;
	}
}
