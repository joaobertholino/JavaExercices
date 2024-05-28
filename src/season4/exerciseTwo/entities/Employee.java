package season4.exerciseTwo.entities;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;

	public Employee(){
		this.name = null;
		this.grossSalary = 0.0;
		this.tax = 0.0;
	}

	public Employee(String name, double grossSalary, double tax){
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	private double natSalary(){
		return this.grossSalary - this.tax;
	}

	public void increaseSalary(double percent){
		this.grossSalary += this.grossSalary * percent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString(){
		return "Name: " + this.name + "\n" + "Nat Salary: " + String.format("%.2f", natSalary());
	}
}
