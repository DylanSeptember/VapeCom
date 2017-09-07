package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by dylan on 8/13/2017.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

    public List<Recipe> findByMixerEmail(String email);
  /*  Recipe create(Recipe recipe);
    Recipe read(int recipe_id);
    Recipe update(Recipe recipe);
    void delete(int recipe_id);*/
}
