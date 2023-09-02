package com.example.finalproject.service;

import com.example.finalproject.model.Category;
import com.example.finalproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public List<Category> getCategoriesOfBudget(Long budgetId) {
        return categoryRepository.findCategoriesByBudget_Id(budgetId);
    }

    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }
}
