package season14.model.entities;

import java.util.Set;

public class Course {
	private String title;
	private Set<Student> students;

	public Course() {
	}

	public Course(String title, Set<Student> students) {
		this.title = title;
		this.students = students;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Student> getStudents() {
		return students;
	}
}
