package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Ingredient_Specification;
import com.VapeRepo.Domain.Mixer;
import com.VapeRepo.Domain.Recipe;
import com.VapeRepo.Domain.Suggestion;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by dylan on 8/13/2017.
 */
public class RecipeFactoryTest {
    Map<String, Object> values;
    /* List<Comment> comment;
     List<FavouriteRecipes> favouriteRecipes;*/
    Mixer mixer = new Mixer();
    Date date = new Date();
    List<Ingredient_Specification> ingredient_specification;

    @Before
    public void setUp() throws Exception{
        values = new HashMap<String, Object>();
        values.put("description", "make more bread");
        values.put("name", "Dylan");
        values.put("date", date);
        values.put("mixer", mixer);
        values.put("ing_spec", ingredient_specification);
        values.put("nicMg", 3);
        values.put("recipe_id", 354);

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
