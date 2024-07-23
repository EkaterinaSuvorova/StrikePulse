package ek.suvorova.strike.pulse.service;

import ek.suvorova.strike.pulse.entity.Category;
import ek.suvorova.strike.pulse.mapper.CategoryMapper;
import ek.suvorova.strike.pulse.repository.CategoryRepository;
import ek.suvorova.strike.pulse.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    public CategoryDto saveCategory(CategoryDto categoryDto) {
        Category categorySaved = categoryRepository.save(
                categoryMapper.categoryDtoToCategory(categoryDto));
        return categoryMapper.categoryToCategoryDto(categorySaved);
    }
}
