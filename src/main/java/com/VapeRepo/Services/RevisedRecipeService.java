package com.VapeRepo.Services;

import com.VapeRepo.Domain.Recipe;
import com.VapeRepo.Domain.RevisedRecipe;

/**
 * Created by dylan on 8/14/2017.
 */
public interface RevisedRecipeService {
    RevisedRecipe create(RevisedRecipe revisedRecipe);
    RevisedRecipe read(Recipe recipe);
    RevisedRecipe update(RevisedRecipe revisedRecipe);
    void delete (Recipe recipe);
}
