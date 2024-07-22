package ek.suvorova.strike.pulse.repository;

import ek.suvorova.strike.pulse.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class CategoryRepository implements JpaRepository<Category, Long> {
}
