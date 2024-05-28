package season14.model.entities;

import java.util.List;

public class Instructor extends Person {
	private Integer idCode;
	private List<Course> courseList;

	public Instructor() {
	}

	public Instructor(Integer idCode, String name, List<Course> courseList) {
		super(name);
		this.idCode = idCode;
		this.courseList = courseList;
	}

	public Integer getIdCode() {
		return idCode;
	}

	public List<Course> getCourseList() {
		return courseList;
	}
}
