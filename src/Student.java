
public class Student extends User {

	private String studentNumber;
	private double gradeAvarage;
	
	public Student() {
		
	}
	
	public Student(String studentNumber, double gradeAvarage) {
		this.studentNumber = studentNumber;
		this.gradeAvarage = gradeAvarage;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public double getGradeAvarage() {
		return gradeAvarage;
	}

	public void setGradeAvarage(double gradeAvarage) {
		this.gradeAvarage = gradeAvarage;
	}

}
