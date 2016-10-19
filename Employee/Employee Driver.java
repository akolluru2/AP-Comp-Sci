import java.util.Scanner;
public class EmployeeDriver {

	public static void main(String[] args) {
		// Creates a new array that can hold Employee Objects
		Employee [] employeeArray = new Employee[3];
		//Now create and intialize three Employee classes and
		//add them to the array.
		Scanner input = new Scanner(System.in);
		Date d1 = new Date(10, 6, 2016);
		Address a1 = new Address(1000, "Crow Canyon", "San Ramon", 95555);
		Employee e1 = new Employee(5, d1, a1 );
		System.out.println("Please enter an employee ID");
		int id = input.nextInt();
		System.out.println("Please enter date as \n mm \n dd \n yyyy");
		Date d2 = new Date (input.nextInt(),input.nextInt(),input.nextInt());
		System.out.println("Please enter Address as \n house number \n street city \n zip code");
		int house_num = input.nextInt();
		String street = input.nextLine();
		String city = input.nextLine();
		int zip = input.nextInt();
		Address a2 = new Address(house_num,street,city,zip);
		
		
		Employee e2 = new Employee(6, new Date(10, 7, 2016), new Address(2009, "Bowl", "SR", 55555));
		Employee e3 = new Employee(id, d2, a2);
		Employee e4 = new Employee (10 , new Date(10,6,2016), new Address(32, "Alcosta", "Danville", 8888));
		
		boolean conflict = e1.getDateOfHire().connflictsWith(e4.getDateOfHire());
		
		if(conflict = true){
			Date l = e4.getDateOfHire();
			l.setDay(12);
			l.setMonth(10);
			l.setYear(2016);
		}
		
		employeeArray[0] = e1;
		employeeArray[1] = e2;
		employeeArray[2] = e4;
		
		for(int i=0;i<employeeArray.length;i++){
			Employee e = employeeArray[i];
			int eID = e.getEmployeeID();
			Date d = e.getDateOfHire();
			Address a = e.getAddress();
			System.out.println(eID);
			System.out.println("Date "+d.getMonth()+"\\"+d.getDay()+"\\"+d.getYear());
			System.out.println("Address "+ a.getHouseNumber() + " " + a.getStreet()+ " " + a.getCity()+ " " + a.getZipcode());
		}
		
	}

}
