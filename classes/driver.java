public class CarDriver {

	public static void main(String[] args) {
		
		Car car1 = new Car(new Seats(5, "red"));
		Car car2 = new Car(new Seats(8, "blue"));
		
		System.out.println(car1.getSeats().compareSeats(car2.getSeats()));

	}

}
