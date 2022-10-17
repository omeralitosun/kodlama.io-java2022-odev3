package odev3.business;

import java.util.List;

import odev3.dataAccess.BaseCourseDao;
import odev3.entities.Course;

public class CourseManager {
	
	private BaseCourseDao courseDao;
	List<Course> allCourses;	
	public CourseManager(BaseCourseDao courseDao, List<Course> allCourses) {
		this.courseDao = courseDao;
		this.allCourses = allCourses;
	}


	public void add(Course course) {
		try {
			if(course.getCoursePrice()<0) {
				throw new Exception("Kursun fiyatı 0'dan küçük olamaz");
			}
			for(Course course1:allCourses) {
				if(course1.getCourseName() ==course.getCourseName()) {
					throw new Exception("Course ismi aynı olamaz");
				}
			}
			courseDao.add(course);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
