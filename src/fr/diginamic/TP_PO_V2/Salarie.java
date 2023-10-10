package fr.diginamic.TP_PO_V2;

public class Salarie {
	String name;
	String firstName;
	double salary;
	
	public Salarie(String name, String firstName, double salary) {
		this.name = name;
		this.firstName = firstName;
		this.salary = salary;
	}
	
	public String toString() {
		return "Salarie [name=" + name + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
