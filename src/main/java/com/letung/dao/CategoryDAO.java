package com.letung.dao;

import com.letung.model.Category;

public interface CategoryDAO {
	public int saveCategory(Category category);
	
	public int getCategoryById();
}
