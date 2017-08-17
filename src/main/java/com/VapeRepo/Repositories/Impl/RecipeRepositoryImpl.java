package com.VapeRepo.Repositories.Impl;

import com.VapeRepo.Domain.Recipe;
import com.VapeRepo.Repositories.RecipeRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dylan on 8/14/2017.
 */
public class RecipeRepositoryImpl /*implements RecipeRepository*/{
    Map<Integer, Recipe> recipeTable;

    public RecipeRepositoryImpl() {
        recipeTable = new HashMap<Integer, Recipe>();
    }

    public Recipe create(Recipe recipe) {
        recipeTable.put(recipe.getRecipe_id(), recipe);
        Recipe savedRecipe = recipeTable.get(recipe.getRecipe_id());
        return savedRecipe;
    }

    public Recipe read(int recipe_id) {
        Recipe recipe = recipeTable.get(recipe_id);
        System.out.println(" The Recipe Object is " + recipe_id);

        return recipe;
    }

    public Recipe update(Recipe recipe) {
        recipeTable.put(recipe.getRecipe_id(), recipe);
        Recipe savedRevisedRecipe = recipeTable.get(recipe.getRecipe_id());
        return savedRevisedRecipe;
    }

    public void delete(int recipe_id) {
        recipeTable.remove(recipe_id);
    }
}
