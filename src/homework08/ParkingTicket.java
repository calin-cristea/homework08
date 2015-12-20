package homework08;

public class ParkingTicket {
	
	private boolean occupiedState;
	private int spotNo;
	private final double distanceToParkingSpot = 0.5;
	
	public ParkingTicket(int spotNo) {
		occupiedState = false;
		this.spotNo = spotNo;
	}

	public boolean getOccupiedState() {
		return occupiedState;
	}
	
	public int getSpotNo() {
		return spotNo;
	}
	
	public void park() {
		occupiedState = true;
	}

	public void unPark() {
		occupiedState = false;
	}

	public double getDistanceToParkingSpot() {
		return distanceToParkingSpot;
	}
	
}
