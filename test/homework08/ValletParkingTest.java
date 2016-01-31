package homework08;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValletParkingTest {

	ValletParking<Car> vp;

	@Before
	public void setUp() {
		vp = new ValletParking<>(3);
	}

	@Test
	public void testParkVehicle_parking_not_full() {
		ParkingTicket ticket = vp.parkVehicle(new Mondeo(35, "car1"));
		assertNotNull(ticket);
	}

	@Test
	public void testParkVehicle_parking_full() {
		vp.parkVehicle(new Mondeo(35, "car1"));
		vp.parkVehicle(new Mondeo(55, "car2"));
		vp.parkVehicle(new Fiesta(45, "car3"));
		assertNull(vp.parkVehicle(new Mondeo(55, "car4")));
	}

	@Test
	public void testRetrieveVehicle_valid_ticket() {
		Car car = new Fiesta(45, "car1");
		Car expectedCar = vp.retrieveVehicle(vp.parkVehicle(car));
		assertEquals(expectedCar, car);
	}

	@Test
	public void testRetrieveVehicle_invalid_ticket() {
		ParkingTicket ticket = null;
		Car expectedCar = vp.retrieveVehicle(ticket);
		assertNull(expectedCar);
	}

}
