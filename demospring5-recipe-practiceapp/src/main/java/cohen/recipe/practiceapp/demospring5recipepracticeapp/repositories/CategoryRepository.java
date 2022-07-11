package cohen.recipe.practiceapp.demospring5recipepracticeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import cohen.recipe.practiceapp.demospring5recipepracticeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{
    
}
