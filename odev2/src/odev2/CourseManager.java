package odev2;

public class CourseManager {
	public CourseManager() {

	}

	public CourseManager(Course[] course) {
		for (Course course2 : course) {
			System.out.println(course2.courseName + " " + course2.lecturerName);
			System.out.println("�lerleme Durumu: " + course2.progressionState);
		}
	}

	public void enrollCourse(Course course) {
		System.out.println(course.courseName + " isimli kursa ba�ar�yla kay�t oldunuz.");
	}

	public void disEnrollmentCourse(Course course) {
		System.out.println(course.courseName + " isimli kurstan kayd�n�z iste�iniz �zerine silinmi�tir.");
	}

}
