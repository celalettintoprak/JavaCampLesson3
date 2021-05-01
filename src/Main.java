public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setFirstName("Mustafa");
		student1.setLastName("Karalı");
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Hakan");
		instructor1.setLastName("Yelkovan");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor1);
		
	}
	
}