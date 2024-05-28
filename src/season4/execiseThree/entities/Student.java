package season4.execiseThree.entities;

public class Student {
	private String name;
	private double gradeOne;
	private double gradeTwo;
	private double gradeThree;

	public Student() {
		this.name = null;
		this.gradeOne = 0.0;
		this.gradeTwo = 0.0;
		this.gradeThree = 0.0;
	}

	public Student(String name, double gradeOne, double gradeTwo, double gradeThree) {
		this.name = name;
		this.gradeOne = gradeOne;
		this.gradeTwo = gradeTwo;
		this.gradeThree = gradeThree;
	}

	public double gradeFinal() {
		return this.gradeOne + this.gradeTwo + this.gradeThree;
	}

	public String isApproved() {
		if (gradeFinal() >= 100 * 0.6) {
			return "PASS";
		} else {
			return "FAILED \nMissing: " + (100 * 0.6 - gradeFinal());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGradeOne() {
		return gradeOne;
	}

	public void setGradeOne(double gradeOne) {
		this.gradeOne = gradeOne;
	}

	public double getGradeTwo() {
		return gradeTwo;
	}

	public void setGradeTwo(double gradeTwo) {
		this.gradeTwo = gradeTwo;
	}

	public double getGradeThree() {
		return gradeThree;
	}

	public void setGradeThree(double gradeThree) {
		this.gradeThree = gradeThree;
	}

	@Override
	public String toString(){
		return "Name of Student: " + this.name + "\n"
				+ "Grade One: " + this.gradeOne + "\n"
				+ "Grade Two: " + this.gradeTwo + "\n"
				+ "Grade Three: " + this.gradeThree;
	}
}
