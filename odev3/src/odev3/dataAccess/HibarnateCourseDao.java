package odev3.dataAccess;

import odev3.core.logging.BaseLogger;
import odev3.entities.Course;

public class HibarnateCourseDao implements BaseCourseDao{
	
	private BaseLogger[] loggers;
	public HibarnateCourseDao(BaseLogger[] loggers) {
		this.loggers = loggers;
	}
	
	@Override
	public void add(Course course) {	
		for(BaseLogger logger : loggers) {
		logger.log(course.getCourseName()+" Kursu eklendi. ***Hibarnate***");
		}
	}
	
	
}
