public class Seats {
	
	private String colorOfSeats;
	private int numberOfSeats;
	
	public Seats(int n, String c){
		numberOfSeats = n;
		colorOfSeats = c;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getColorOfSeats() {
		return colorOfSeats;
	}

	public void setColorOfSeats(String colorOfSeats) {
		this.colorOfSeats = colorOfSeats;
	}
	
	public boolean compareSeats(Seats seat){
		if (this.colorOfSeats == seat.colorOfSeats){
			return true;
		}else{
			return false;
		}
	}	
}
