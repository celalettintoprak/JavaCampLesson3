
public class StudentManager extends UserManager{
	
	@Override
	public void add() {
		System.out.println("Öğrenci sisteme başarılı bir şekilde kaydedilmiştir...");
	}
	
	@Override
	public void delete() {
		System.out.println("Öğrencinin kaydı silinmiştir...");
	}
	
	public void addStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName()
		+ " isimli öğrenci sisteme başarıyla kayıt yapılmıştır...");
	}
	
	public void deleteStudent(String studentNumber) {
		System.out.println("Öğrenci kaydı silinmiştir...");
	}
	
	public void updateStudentInfo(String studentNumber) {
		System.out.println("Öğrenci bilgileri güncellenmiştir...");
	}
	
}
