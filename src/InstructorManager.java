
public class InstructorManager extends UserManager {

	@Override
	public void add() {
		System.out.println("Eğitmen sisteme başarıyla tanımlanmıştır...");
	}
	
	@Override
	public void delete() {
		System.out.println("Eğitmen başarıyla sistemden kaldırılmıştır...");
	}
	
	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName()
		+ " isimli eğitmen sisteme başarılı bir şekilde kaydedilmiştir...");
	}
	
	public void deleteInstructor(Instructor instructor) {
		System.out.println("Eğitmen sistemden silinmiştir...");
	}
	
	public void updateInstructorInfo(Instructor instructor) {
		System.out.println("Eğitmen bilgileri güncellenmiştir...");
	}
	
}
