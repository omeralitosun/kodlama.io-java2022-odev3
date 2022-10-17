package odev3;

import java.util.ArrayList;
import java.util.List;

import odev3.business.CategoryManager;
import odev3.business.CourseManager;
import odev3.core.logging.*;
import odev3.dataAccess.HibarnateCategoryDao;
import odev3.dataAccess.HibarnateCourseDao;
import odev3.dataAccess.JdbcCategoryDao;
import odev3.dataAccess.JdbcCourseDao;
import odev3.entities.Category;
import odev3.entities.Course;
import odev3.entities.Instructor;

public class Main {

	public static void main(String[] args) {

		//Course ve category kayıtları için list oluşturduk.
		List<Course> courses = new ArrayList<>();
		List<Category> categorys = new ArrayList<>();
		
		//Course construcator metodunun parametreleri için birer adet Category ve Instructor nesnesi oluşturduk.
		Category category = new Category(1,"Programlama");
		Instructor ınstructor = new Instructor(1,"Engin Demirog");
		
		//Course listesini doldurduk.
		courses.add(new Course(1,"Java",category,ınstructor,1000));
		courses.add(new Course(2,"C#",category,ınstructor,1000));
		
		//Category listesini doldurduk.
		categorys.add(category);
		
		//***************
		
		//Hibarnate kullandığımız CourseManager nesnesi.
		CourseManager courseManager = 
				new CourseManager(new HibarnateCourseDao(new BaseLogger[] {new FileLogger(),new EmailLogger()}),courses);
		//JDBC kullandığımız CourseManager nesnesi.
		CourseManager courseManager2 = 
				new CourseManager(new JdbcCourseDao(new BaseLogger[] {new FileLogger(),new EmailLogger()}),courses);
		
		//Course ekleniyor
		courseManager.add(new Course(3,"Python",category,ınstructor,100));
		courseManager.add(new Course(4,"Java",category,ınstructor,100));
		
		courseManager2.add(new Course(3,"C++",category,ınstructor,10));
		courseManager2.add(new Course(4,"Java",category,ınstructor,-100));
		
		//***************
		System.out.println("*******************************");
		//Hibarnate kullandığımız CourseManager nesnesi.
				CategoryManager categoryManager = 
						new CategoryManager(new HibarnateCategoryDao(new BaseLogger[] {new FileLogger(),new EmailLogger()}),categorys);
		//JDBC kullandığımız CourseManager nesnesi.
				CategoryManager categoryManager2 =
						new CategoryManager(new JdbcCategoryDao(new BaseLogger[] {new FileLogger(),new EmailLogger()}),categorys);
		
		categoryManager.add(new Category(2,"Veri Tabanı"));
		categoryManager2.add(new Category(3,"Tümü"));
		categoryManager.add(new Category(4,"Programlama"));
		
	}

}
