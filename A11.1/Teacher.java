public class Teacher extends Person{
  private String Subject; // Student Id Number
  private double Salary; // grade point average

  // constructor
  public Teacher(String name, int age, String gender,
            String Subject, double Salary){
    // use the super class' constructor
    super(name, age, gender);

    // initialize what's new to Student
    this.Subject = Subject;
    this.Salary = Salary;
  }

  public String getSubject(){
    return Subject;
  }

  public double getSalary(){
    return Salary;
  }

  public void setSubject(String Subject){
    this.Subject = Subject;
  }

  public void setSalary(double Salary){
    this.Salary = Salary;
  }

  // overrides the toString method in the parent class
  public String toString(){
    return super.toString() + ", Subject: " + Subject + ", Salary: " + Salary;
  }
}
