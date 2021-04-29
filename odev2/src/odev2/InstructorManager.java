package odev2;

public class InstructorManager {
	public InstructorManager(Lecturer[] lecturers) {
		for (Lecturer lecturer : lecturers) {
			System.out.println(lecturer.lecturerName);
		}
	}

}
