package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dylan on 8/13/2017.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
  /*  Recipe create(Recipe recipe);
    Recipe read(int recipe_id);
    Recipe update(Recipe recipe);
    void delete(int recipe_id);*/
}
