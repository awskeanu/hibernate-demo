package com.spring.hibernate_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.spring.hibernate_demo.dao.StudentDao;
import com.spring.hibernate_demo.entity.Student;
// import java.util.List;

@SpringBootApplication
public class HibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return runner -> {
			createStudent(studentDao);
			// readStudent(studentDao);
			// queryStudents(studentDao);
			// queryStudentsByLastName(studentDao);
			// updateStudent(studentDao);
			// deleteStudent(studentDao);
			// deleteAllStudents(studentDao);
		};
	}

	// private void deleteAllStudents(StudentDao studentDao) {
	// 	System.out.println("Deleting all student information...");
	// 	int rowsDeleted = studentDao.deleteAll();
	// 	System.out.println("Number of deleted rows: " + rowsDeleted);
	// }

	// private void deleteStudent(StudentDao studentDao) {
	// 	int id = 1;
	// 	System.out.println("Delete ID: " + id);

	// 	// delete the student	
	// 	studentDao.delete(id);
	// }

	// private void updateStudent(StudentDao studentDao) {
	// 	// retrieve student based on the id
	// 	int id = 1;
	// 	System.out.println("Student ID: " + id);
	// 	Student student = studentDao.findById(id);

	// 	// change first name 
	// 	System.out.println("Updating student name...");
	// 	student.setFirstName("Dark");

	// 	// update the student
	// 	studentDao.update(student);

	// 	// display updated student information
	// 	System.out.println("Updated student information: " + student);
	// }
	
	// private void queryStudentsByLastName(StudentDao studentDao) {
	// 	// get list of students
	// 	List<Student> students = studentDao.findByLastName("Kamado");

	// 	// display list of students
	// 	for (Student s : students) {
	// 		System.out.println(s);
	// 	}
	// }

	// private void queryStudents(StudentDao studentDao) {
	// 	// get list of students
	// 	List<Student> students = studentDao.findAll();

	// 	// display list of students
	// 	for (Student s : students) {
	// 		System.out.println(s);
	// 	}
	// }

	// private void readStudent(StudentDao studentDao) {
	// 	// retrieve student based on the id
	// 	System.out.println("Retrieving student id in 2...");
	// 	Student student = studentDao.findById(1);

	// 	// display student
	// 	System.out.println("Found the student " + student);
	// }
	
	private void createStudent(StudentDao studentDao) {
		// create student object
		System.out.println("Creating new student information...");
		Student student = new Student("Light", "Yagami", "light.yagami@example.com");

		// save student object
		System.out.println("Saving student information...");
		studentDao.save(student);

		// display id of the saved student
		System.out.println("Saved! Generated id: " + student.getId());
	}
}
