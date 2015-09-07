package com.rhcloud.jobsnetwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhcloud.jobsnetwork.entity.Category;
import com.rhcloud.jobsnetwork.interfaces.IDatabaseCrud;
import com.rhcloud.jobsnetwork.repository.CategoryRepository;

@Service
public class CategoryService implements IDatabaseCrud<Category>{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void save(Category obj) {
		// TODO Auto-generated method stub
		categoryRepository.save(obj);
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}
