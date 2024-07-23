package ek.suvorova.strike.pulse.controller;

import ek.suvorova.strike.pulse.service.CategoryService;
import ek.suvorova.strike.pulse.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public CategoryDto createCategory(CategoryDto categoryDto) {
        return categoryService.saveCategory(categoryDto);
    }
}
