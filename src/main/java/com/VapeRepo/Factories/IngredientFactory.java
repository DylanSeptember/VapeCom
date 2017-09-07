package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Ingredient;

import java.util.Date;
import java.util.Map;

/**
 * Created by dylan on 9/3/2017.
 */
public class IngredientFactory {
    public static Ingredient buildIngredient(Map<String, Object> values){

        Ingredient ingredient = new Ingredient.Builder()
                //     .comment_id((Integer) values.get("comment_id"))
                .brand((String) values.get("brand"))
                .description((String) values.get("description"))
                //.date((Date) values.get("date"))
                // .mixer((Mixer) values.get("mixer"))
                .build();
        return ingredient;
    }
}
