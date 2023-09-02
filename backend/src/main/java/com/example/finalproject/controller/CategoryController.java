package com.example.finalproject.controller;

import com.example.finalproject.model.Category;
import com.example.finalproject.service.CategoryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("categories")
public class CategoryController {
    CategoryService categoryService;

    @GetMapping()
    public List<String> getAllCategoryNames() {
        List<String> categoryNames = new ArrayList<>();
        for (Category c : categoryService.getAllCategories()) {
            categoryNames.add(c.getName());
        }
        return categoryNames;
    }
}
