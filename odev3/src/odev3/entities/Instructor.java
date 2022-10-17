package odev3.entities;

public class Instructor {
	private int ınstructorId;
	private String ınsctructorId;
	
	public Instructor() {

	}
	
	public Instructor(int instructorId, String insctructorId) {
		ınstructorId = instructorId;
		ınsctructorId = insctructorId;
	}

	public int getInstructorId() {
		return ınstructorId;
	}

	public void setInstructorId(int instructorId) {
		ınstructorId = instructorId;
	}

	public String getInsctructorId() {
		return ınsctructorId;
	}

	public void setInsctructorId(String insctructorId) {
		ınsctructorId = insctructorId;
	}
	
}
