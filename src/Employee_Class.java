

/* Create a class called Employee that includes three instance variables: a first name (type String), a last
 * name (type String), and a monthly salary (type double). Provide a constructor that initializes the three 
 * instance variables. Provide a set and get method for each instance variable. If the monthly salary is not
 * positive, do not set its value. Write a test class called EmployeeTest which creates two Employee objects 
 * and then displays each object�s annual salary. Then give each employee a 10% raise and display each 
 * employee�s annual salary again.
 */




public class Employee_Class {

	public static void main(String[] args) {
		
		employee Employee1 = new employee("Bob", "Smith", 3000);
	}

}
class employee{
	String FirstName;
	
	String LastName;
	
	double MonthlySalary;
	
	employee(String FirstName2, String LastName2, double MonthlySalary2){
		
		FirstName = FirstName2;
		LastName = LastName2;
		MonthlySalary = MonthlySalary2;
		
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public double getMonthlySalary() {
		return MonthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		MonthlySalary = monthlySalary;
	}
	
	
}	
