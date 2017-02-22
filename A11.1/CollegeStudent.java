public class CollegeStudent extends Student{
  private String Major;
  private int Year;

  // constructor
  public CollegeStudent(String name, int age, String gender,
            String idNum, double gpa, int year, String major){
    // use the super class' constructor
    super(name, age, gender, idNum, gpa);

    // initialize what's new to Student
    Major = major;
    Year = year;
  }

  public String getMajor(){
    return Major;
  }

  public int getYear(){
    return Year;
  }

  public void setMajor(String major){
    Major = major;
  }

  public void setYear(int year){
    Year = year;
  }

  // overrides the toString method in the parent class
  public String toString(){
    return super.toString() + ", Major: " + Major + ", Year: " + Year;
  }
}
