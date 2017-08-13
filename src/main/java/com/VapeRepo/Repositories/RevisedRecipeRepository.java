package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Recipe;
import com.VapeRepo.Domain.RevisedRecipe;

/**
 * Created by dylan on 8/13/2017.
 */
public interface RevisedRecipeRepository {
    RevisedRecipe create(RevisedRecipe revisedRecipe);
    RevisedRecipe read(Recipe recipe);
    RevisedRecipe update(RevisedRecipe revisedRecipe);
    void delete(Recipe recipe);
}
