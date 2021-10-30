package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.dao.IArticleDao;
import com.stock.mvc.dao.ICategoryDao;
import com.stock.mvc.entities.Category;
import com.stock.mvc.services.ICategoryService;

public class CategorieServiceImpl implements ICategoryService {

	
	private  ICategoryDao dao;
	public void setDao(ICategoryDao dao) {
		this.dao = dao;
	}
	@Override
	public Category save(Category entity) {
		
		return dao.save(entity);
	}

	@Override
	public Category update(Category entity) {
		
		return dao.update(entity);
	}

	@Override
	public Category getById(Long id) {
		
		return dao.getById(id);
	}

	@Override
	public Category findOne(String paramName, Object paramValue) {
		
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Category findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return dao.findCountBy(paramName, paramValue);
	}

	@Override
	public List<Category> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<Category> selectAll(String sortField, String sort) {
		
		return dao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

}
