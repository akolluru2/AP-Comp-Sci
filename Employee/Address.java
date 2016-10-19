
public class Address {
	
	private String street;
	
	private String city;
	private int houseNumber;
	private int zipcode;
	
	public Address(){
		
	}
	
	public Address (int hN, String s, String c, int z){
		houseNumber = hN;
		street = s;
		city = c;
		zipcode = z;
	}
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}
