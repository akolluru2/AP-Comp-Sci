public class Car {
	
private Seats seats;
	
	public Car(){
		setSeats(null);
	}
	
	public Car(Seats s){
		seats = s;
	}

	public Seats getSeats() {
		return seats;
	}

	public void setSeats(Seats seats) {
		this.seats = seats;
	}	

}
