package season6.exerciseThree.entities;

public class Person {
	private final String name;
	private int age;
	private double height;

	public Person() {
		this.name = null;
		this.age = 0;
		this.height = 0.0;
	}

	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString(){
		return "Name: " + this.name + "\n"
				+ "Age: " + this.age + "\n"
				+ "Height: " + this.height + "\n";
	}
}
