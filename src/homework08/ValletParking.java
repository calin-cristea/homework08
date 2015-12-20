package homework08;

public class ValletParking<T extends Vehicle> {
	
	public ParkingTicket parkVehicle(T elem) {
		ParkingTicket ticket = new ParkingTicket();
		elem.start();
		elem.shiftGear(1);
		elem.drive(ticket.getDistanceToParkingSpot());
		return ticket;
	}
	
	public T retrieveVehicle (ParkingTicket ticket) {
		return null;
		
	}
}
