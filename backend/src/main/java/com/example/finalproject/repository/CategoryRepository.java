package com.example.finalproject.repository;

import com.example.finalproject.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findCategoriesByBudget_Id(Long id);
}
