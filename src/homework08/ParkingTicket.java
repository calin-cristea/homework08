package homework08;

public class ParkingTicket {
	
	private boolean isOccupied;
	private int spotNo;
	private final double distanceToParkingSpot = 0.5;
	
	public ParkingTicket(int spotNo) {
		isOccupied = false;
		this.spotNo = spotNo;
	}

	public boolean isOccupied() {
		return isOccupied;
	}
	
	public int getSpotNo() {
		return spotNo;
	}
	
	public void park() {
		isOccupied = true;
	}

	public void unPark() {
		isOccupied = false;
	}

	public double getDistanceToParkingSpot() {
		return distanceToParkingSpot;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + spotNo;
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
		ParkingTicket other = (ParkingTicket) obj;
		if (spotNo != other.spotNo)
			return false;
		return true;
	}
	
}
