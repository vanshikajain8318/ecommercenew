package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Category;
import com.ecommerce.repository.CategoryRepository;

@Service
public class CategoryService {
@Autowired
CategoryRepository categoryRepository;

//retrieval
public List<Category> getallCategory(){
	return categoryRepository.findAll();
}

//add category
public void addCategory(Category category) {
	categoryRepository.save(category);
}
}
