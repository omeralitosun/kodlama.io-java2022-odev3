package odev3.dataAccess;

import odev3.core.logging.BaseLogger;
import odev3.entities.Category;

public class JdbcCategoryDao implements BaseCategoryDao{

	private BaseLogger[] loggers;
	
	public JdbcCategoryDao(BaseLogger[] loggers) {
		this.loggers = loggers;
	}

	@Override
	public void add(Category category) {
		for(BaseLogger logger : loggers) {
			logger.log(category.getCategoryName()+" Kategorisi eklendi. ***JDBC***");
			}
	}
}
