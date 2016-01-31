package homework08;


/**
 * The Class ParkingTicket.
 */
public class ParkingTicket {
	
	private boolean isOccupied;
	private int spotNo;
	private final float distanceToParkingSpot = 0.5f;
	
	/**
	 * Instantiates a new parking ticket.
	 *
	 * @param spotNo the spot no
	 */
	public ParkingTicket(int spotNo) {
		isOccupied = false;
		this.spotNo = spotNo;
	}

	/**
	 * Checks if is occupied.
	 *
	 * @return true, if is occupied
	 */
	public boolean isOccupied() {
		return isOccupied;
	}
	
	/**
	 * Gets the spot no.
	 *
	 * @return the spot no
	 */
	public int getSpotNo() {
		return spotNo;
	}
	
	/**
	 * Set parking state to true.
	 */
	public void park() {
		isOccupied = true;
	}

	/**
	 * Set parking state to false.
	 */
	public void unPark() {
		isOccupied = false;
	}

	/**
	 * Gets the distance to parking spot.
	 *
	 * @return the distance to parking spot
	 */
	public float getDistanceToParkingSpot() {
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
