package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Ingredient_Specification;
import com.VapeRepo.Domain.Mixer;
import com.VapeRepo.Domain.Recipe;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by dylan on 8/13/2017.
 */
public class RecipeFactory {
    public static Recipe getRecipe(Map<String, Object> values){

        Recipe recipe = new Recipe.Builder()
                .name((String) values.get("name"))
                .description((String) values.get("description"))
                .date((Date) values.get("date"))
                .mixer((Mixer) values.get("mixer"))
                .ing_spec((List<Ingredient_Specification>) values.get("ing_spec"))
                .nicMg((Integer) values.get("nicMg"))
                .recipe_id((Integer) values.get("recipe_id"))
                .build();
        return recipe;
    }
}
