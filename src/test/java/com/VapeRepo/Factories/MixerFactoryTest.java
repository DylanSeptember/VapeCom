package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Recipe;
import com.VapeRepo.Domain.Viewer;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by dylan on 8/13/2017.
 */
public class MixerFactoryTest {
    Map<String, Object> values;
    /* List<Comment> comment;
     List<FavouriteRecipes> favouriteRecipes;*/
   /* Mixer mixer = new Mixer();
    Date date = new Date();
    List<Ingredient_Specification> ingredient_specification;*/
   List<Recipe> recipes;
   Viewer viewer;

    @Before
    public void setUp() throws Exception{
        values = new HashMap<String, Object>();
        values.put("recipes", recipes);
        values.put("viewer", viewer);

    }

    @Test
    public void getNameFalse() throws Exception {
        Recipe recipe = RecipeFactory.getRecipe(values);
        assertEquals("cakeman", recipe.getName());
    }

    @Test
    public void getNameTrue() throws Exception {
        Recipe recipe = RecipeFactory.getRecipe(values);
        assertEquals("Dylan", recipe.getName());
    }
}