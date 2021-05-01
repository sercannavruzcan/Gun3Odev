package Gun3Odev;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.id = 1;
		student.email ="sercannavruzcann@gmailcom";
		student.firstName = "Sercan";
		student.lastName = "Navruzcan";
		student.password = " ";
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.email = " ";
		instructor.firstName = "Engin";
		instructor.lastName = "Demiroğ";
		instructor.password = " ";
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager =  new  InstructorManager();
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.add(instructor);
		
		
		
		
		
				

	}

}
