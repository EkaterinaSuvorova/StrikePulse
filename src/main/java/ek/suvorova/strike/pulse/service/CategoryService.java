package ek.suvorova.strike.pulse.service;

import ek.suvorova.strike.pulse.entity.Category;
import ek.suvorova.strike.pulse.repository.CategoryRepository;
import ek.suvorova.strike.pulse.to.CategoryTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public CategoryTO saveCategory(CategoryTO categoryTO) {
        //todo add mapper
        Category category = new Category();
        category.setName(categoryTO.getName());
        Category categorySaved = categoryRepository.save(category);
        CategoryTO categoryTOSaved = new CategoryTO();
        categoryTOSaved.setName(categorySaved.getName());
        return categoryTOSaved;
    }
}
