package ek.suvorova.strike.pulse.mapper;

import ek.suvorova.strike.pulse.dto.CategoryDto;
import ek.suvorova.strike.pulse.entity.Category;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper {
    CategoryDto categoryToCategoryDto(Category category);
    Category categoryDtoToCategory(CategoryDto categoryDto);
}
