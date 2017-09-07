package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Ingredient;
//import com.VapeRepo.Domain.IngredientSpecification;
//import com.VapeRepo.Domain.Ingredient_Specification;
import com.VapeRepo.Domain.Ingredientspecification;
import com.VapeRepo.Domain.Recipe;

import java.util.Map;

/**
 * Created by dylan on 9/3/2017.
 */
public class Ingredient_SpecificationFactory {
    public static Ingredientspecification buildIngredientSpecification(Map<String, Object> values){

        Ingredientspecification ingredientSpecification = new Ingredientspecification.Builder()
                .percentage((Integer) values.get("percentage"))
                .recipe((Recipe) values.get("recipe"))
                .ingredient((Ingredient) values.get("ingredient"))
                // .mixer((Mixer) values.get("mixer"))
                .build();
        return ingredientSpecification;
    }
}
