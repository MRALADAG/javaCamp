package odev2;

public class Category {
	public Category(CourseType[] courseTypes) {
		for (CourseType courseType : courseTypes) {
			System.out.println(courseType.typeName);
		}

	}

}
