package odev2;

public class CourseManager {
	public CourseManager() {

	}

	public CourseManager(Course[] course) {
		for (Course course2 : course) {
			System.out.println(course2.courseName + " " + course2.lecturerName);
			System.out.println("Ýlerleme Durumu: " + course2.progressionState);
		}
	}

	public void enrollCourse(Course course) {
		System.out.println(course.courseName + " isimli kursa baþarýyla kayýt oldunuz.");
	}

	public void disEnrollmentCourse(Course course) {
		System.out.println(course.courseName + " isimli kurstan kaydýnýz isteðiniz üzerine silinmiþtir.");
	}

}
