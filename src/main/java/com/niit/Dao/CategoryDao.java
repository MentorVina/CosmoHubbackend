package com.niit.Dao;

import java.util.List;

import com.niit.Model.Category;

public interface CategoryDao {
	public void  insertCategory(Category category);
	List <Category>  getAllCategory();
	public Category  getCategory(int cid);
	public void  updateCategory(Category category);
	public void  deleteCategory(Category category);
}
