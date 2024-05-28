package season14.model.entities;

public class Student extends Person {
	private Integer idCode;

	public Student() {
	}

	public Student(Integer idCode, String name) {
		super(name);
		this.idCode = idCode;
	}

	public Integer getIdCode() {
		return idCode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Student student = (Student) o;
		return idCode.equals(student.idCode);
	}

	@Override
	public int hashCode() {
		return idCode.hashCode();
	}
}
