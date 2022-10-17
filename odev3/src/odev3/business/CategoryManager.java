package odev3.business;

import java.util.List;

import odev3.dataAccess.BaseCategoryDao;
import odev3.entities.Category;

public class CategoryManager {

	private BaseCategoryDao categoryDao;
	List<Category> allCategorys;
	
	
	public CategoryManager(BaseCategoryDao categoryDao, List<Category> allCategorys) {
		this.categoryDao = categoryDao;
		this.allCategorys = allCategorys;
	}

	public void add(Category category) {
		try {

			for(Category category1:allCategorys) {
				if(category1.getCategoryName() ==category.getCategoryName()) {
					throw new Exception("Kategori ismi aynı olamaz");
				}
			}
			categoryDao.add(category);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
