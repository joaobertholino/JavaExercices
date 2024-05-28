package season15.model.entities;

public class Candidate extends Person {
	private Integer wishes;

	public Candidate() {
	}

	public Candidate(Integer wishes) {
		this.wishes = wishes;
	}

	public Candidate(String name, Integer wishes) {
		super(name);
		this.wishes = wishes;
	}

	public Integer getWishes() {
		return wishes;
	}
}
