package odev2;

// 27.04.2021

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course();
		course1.courseId = 1;
		course1.courseName = "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)";
		course1.lecturerName = "Engin Demirog";
		course1.progressionState = 89;

		Course course2 = new Course();
		course2.courseId = 2;
		course2.courseName = "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
		course2.lecturerName = "Engin Demirog";
		course2.progressionState = 12;

		Course course3 = new Course();
		course3.courseId = 3;
		course3.courseName = "Programlamaya Giriþ için Temel Kurs";
		course3.lecturerName = "Engin Demirog";
		course3.progressionState = 100;

		Course[] courses = { course1, course2, course3 };

		CourseManager courseManager = new CourseManager(courses);

		Lecturer lecturer1 = new Lecturer();
		lecturer1.lecturerId = 0;
		lecturer1.lecturerName = "Tümü";

		Lecturer lecturer2 = new Lecturer();
		lecturer2.lecturerId = 0;
		lecturer2.lecturerName = "Engin Demirog";

		Lecturer[] lecturers = { lecturer1, lecturer2 };

		InstructorManager instructorManager = new InstructorManager(lecturers);

		CourseType courseType1 = new CourseType();
		courseType1.id = 0;
		courseType1.typeName = "Tümü";

		CourseType courseType2 = new CourseType();
		courseType2.id = 1;
		courseType2.typeName = "Programlama";

		CourseType[] courseTypes = { courseType1, courseType2 };

		Category category = new Category(courseTypes);

		courseManager.enrollCourse(course3);

		CourseManager courseManager2 = new CourseManager();
		courseManager2.enrollCourse(course2);

		courseManager.disEnrollmentCourse(course3);

	}

}
