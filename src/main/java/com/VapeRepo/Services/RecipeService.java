package com.VapeRepo.Services;

import com.VapeRepo.Domain.Recipe;

/**
 * Created by dylan on 8/14/2017.
 */
public interface RecipeService {
    Recipe create(Recipe recipe);
    Recipe read(int recipe_id);
    Recipe update(Recipe recipe);
    void delete (int recipe_id);
}
