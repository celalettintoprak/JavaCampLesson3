
public class Instructor extends User {
	
	private String instructorID, branch;
	
	public Instructor() {
		
	}

	public Instructor(String instructorID, String branch) {
		this.instructorID = instructorID;
		this.branch = branch;
	}

	public String getInstructorID() {
		return instructorID;
	}

	public void setInstructorID(String instructorID) {
		this.instructorID = instructorID;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}
