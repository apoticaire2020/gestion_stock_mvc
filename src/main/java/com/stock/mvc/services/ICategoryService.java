package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.Category;

public interface ICategoryService {

	public Category save(Category entity);
	public Category update(Category entity);
	public Category getById(Long id);
	public Category findOne(String paramName , Object paramValue);
	public Category findOne(String[] paramName , Object[] paramValue);
	
	public int findCountBy(String paramName , String paramValue);
	
	public List<Category> selectAll();
	public List<Category> selectAll(String sortField , String sort);
	
	public void remove(Long id);
}
