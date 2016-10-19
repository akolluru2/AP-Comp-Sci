import java.util.Scanner;
public class Employee {
	private int employeeID;
	private Date dateOfHire;
	private Address address;
	
	public Employee(){
		/*Scanner input = new Scanner(System.in);
		System.out.println("Please enter an ID#");
		this.employeeID = input.nextInt();
		System.out.println("Please enter a month as mm");
		Date.setMonth(input.nextInt());
		System.out.println("Please enter a month as dd");
		Date.setDay(input.nextInt());
		System.out.println("Please enter a month as yyyy");
		Date.setYear(input.nextInt());
		System.out.println();
		this.address = input.nextLine();*/
	}
	
	public Employee(int employeeID, Date dateOfHire, Address address){
		this.employeeID = employeeID;
		this.dateOfHire = dateOfHire;
		this.address = address;
	}
	
	public int getEmployeeID(){
		return employeeID;
	}
	
	public Date getDateOfHire(){
		return dateOfHire;
	}
	
	public Address getAddress(){
		return address;
	}
	
	public void setEmployeeID(int empID){
		employeeID = empID;
	}
	
	public void setDateOfHire(Date date){
		dateOfHire = date;
	}
	public void setAddress(Address add){
		address = add;
	}
}
