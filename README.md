Generics assignment

Tasks

    Implement a Vallet Parking class.

A vallet parking class should work only with classes that are of type Vehicle (reuse Vehicle classes from previous homeworks - feel free to modify/adapt the vehicle classes to the problem).

ValletParking<Car> carPark = new ValletParking<Car>();

Car car = new Golf4();// car has drive and getCurrentAmountOfFuel methods.

float amountOfFuelBeforeParking = car.getCurrentAmountOfFuel();

ParkingTicket ticket = carPark.parkVehicle(car); // the vallet gives you ticket and drives your car to an empty spot. That could be on the 5th floor of the parking lot.

// eat pizza, don't drink alcohol

car = carPark.retrieveVehicle(ticket); // the vallet checks your ticket and finds your car according to it, and drives it back to you.

float amountOfFuelAfterParking = car.getCurrentAmountOfFuel();

Restrictions:

    ValletParking<Object> or ValletParking<String> is not allowed.
    If Subaru extends Object, but does not implement Vehicle, ValletParking<Subaru> is not allowed.

    Write unit tests where you validate all the methods of ValetParking.

Take into account that while the valet drove your car, the fuel amount decreased.

i.e assert amountOfFuelAfterParking < amountOfFuelBeforeParking;

    Create parkings with other Vehicle types:

ValletParking<Helicopter> carPark = new ValletParking<Helicopter>();

ValletParking<Motorcycle> carPark = new ValletParking<Motorcycle>();

...

Or come up with your own Vehicle type (MyPrettyPony).

    Homework must be uploaded to GitHub
    All Commits in Git MUST have commit messages.

Penalties:

    No unit tests -> homework is not graded
    Code does not compile or crashes -> homework is not graded
    Code is not uploaded to GitHub -> homework is not graded
    No commit messages -> -2p
    Incorrect usage of naming conventions -> -1p
    Code is not formatted -> -1p
    Code is not documented -> -1p