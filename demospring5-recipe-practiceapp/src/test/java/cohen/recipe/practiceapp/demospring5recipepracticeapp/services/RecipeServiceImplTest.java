package cohen.recipe.practiceapp.demospring5recipepracticeapp.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import cohen.recipe.practiceapp.demospring5recipepracticeapp.domain.Recipe;
import cohen.recipe.practiceapp.demospring5recipepracticeapp.repositories.RecipeRepository;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock 
    RecipeRepository recipeRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }


    @Test
    void testGetRecipes() {
        Recipe recipe = new Recipe();
        HashSet<Recipe> recipesData = new HashSet<>();
        recipesData.add(recipe);
    
        when(recipeRepository.findAll()).thenReturn(recipesData);

        Set<Recipe> recipes = recipeService.getRecipes();

        assertEquals(recipes.size(), 1);
        verify(recipeRepository, times(1)).findAll();
    }
}
