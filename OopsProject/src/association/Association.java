package association;

public class Association {
	public static void main(String[] args) {
		//vehicle
		Bus bus = new Bus();
		bus.setAmountOfBus(10);
		bus.setSpeedOfBus(40);
		
		Taxi taxi = new Taxi();
		taxi.setAmountOfTaxi(15);
		taxi.setSpeedOfTaxi(25);
		
		Car car = new Car();
		car.setAmountOfCar(30);
		car.setSpeedOfCar(60);
		
		//passenger
		Passenger person = new Passenger();
		person.setName("Raj");
		person.setAge(20);
		person.setCity("Pune");
		
		//ticket booking
		BookTicket ticket = new BookTicket();
		Ticket ticket1 = ticket.bookTicket(person, bus, taxi, car);
		
		//print
		System.out.println("Bus : " + bus);
		System.out.println("Taxi : " + taxi);
		System.out.println("Car : " + car);
		
		System.out.println("Passenger Details : " + person);
		System.out.println("Your Ticket Details : " + ticket1);
		
	}
}
//passenger uses a bus,taxi,car
//ticket booking
class Passenger {
	String name;
	int age;
	String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
}
class Vehicle {
	int vehicleNumber;
	int numberOfSeats;
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
}
class Bus extends Vehicle {
	int amountOfBus;
	int speedOfBus;
	public int getAmountOfBus() {
		return amountOfBus;
	}
	public void setAmountOfBus(int amountOfBus) {
		this.amountOfBus = amountOfBus;
	}
	public int getSpeedOfBus() {
		return speedOfBus;
	}
	public void setSpeedOfBus(int speedOfBus) {
		this.speedOfBus = speedOfBus;
	}
	@Override
	public String toString() {
		return "Bus [amountOfBus=" + amountOfBus + ", speedOfBus=" + speedOfBus + "]";
	}
	
	
}
class Taxi extends Vehicle{
	int amountOfTaxi;
	int speedOfTaxi;
	public int getAmountOfTaxi() {
		return amountOfTaxi;
	}
	public void setAmountOfTaxi(int amountOfTaxi) {
		this.amountOfTaxi = amountOfTaxi;
	}
	public int getSpeedOfTaxi() {
		return speedOfTaxi;
	}
	public void setSpeedOfTaxi(int speedOfTaxi) {
		this.speedOfTaxi = speedOfTaxi;
	}
	@Override
	public String toString() {
		return "Taxi [amountOfTaxi=" + amountOfTaxi + ", speedOfTaxi=" + speedOfTaxi + "]";
	}
	
}
class Car extends Vehicle {
	int amountOfCar;
	int speedOfCar;
	public int getAmountOfCar() {
		return amountOfCar;
	}
	public void setAmountOfCar(int amountOfCar) {
		this.amountOfCar = amountOfCar;
	}
	public int getSpeedOfCar() {
		return speedOfCar;
	}
	public void setSpeedOfCar(int speedOfCar) {
		this.speedOfCar = speedOfCar;
	}
	@Override
	public String toString() {
		return "Car [amountOfCar=" + amountOfCar + ", speedOfCar=" + speedOfCar + "]";
	}
	
	
}
class Ticket extends Passenger {// is-A relation
	String way;
	int price;
	String vehicleType;
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	@Override
	public String toString() {
		return "Ticket [way=" + way + ", price=" + price + ", vehicleType=" + vehicleType + "]";
	}
	
}
class BookTicket {
	Ticket bookTicket(Passenger person, Bus bus, Taxi taxi, Car car) {
		System.out.println("---------------Booking Your Ticket----------------");
		Ticket ticket = new Ticket();
		ticket.setWay("twoWay");
		ticket.setVehicleType("Taxi");
		if(ticket.getVehicleType() == "Bus") {
			if(ticket.getWay() =="oneWay") {
				ticket.setPrice(bus.getAmountOfBus());
			} else {
				ticket.setPrice(2 * bus.getAmountOfBus());
			}
		} else if(ticket.getVehicleType() == "Taxi") {
			if(ticket.getWay() =="oneWay") {
				ticket.setPrice(taxi.getAmountOfTaxi());
			} else {
				ticket.setPrice(2 * taxi.getAmountOfTaxi());
			}
		} else {
			if(ticket.getWay() =="oneWay") {
				ticket.setPrice(car.getAmountOfCar());
			} else {
				ticket.setPrice(2 * car.getAmountOfCar());
			}
		}
		return ticket;
	}
}


