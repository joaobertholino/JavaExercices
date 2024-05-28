package season18.model.entities;

public class Employee extends Person {
	private String email;
	private Double wage;

	public Employee() {
	}

	public Employee(String name, String email, Double wage) {
		super(name);
		this.email = email;
		this.wage = wage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getWage() {
		return wage;
	}

	public void setWage(Double wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + " - " + "E-mail: " + this.email + " - " + "Wage: " + this.wage;
	}
}
