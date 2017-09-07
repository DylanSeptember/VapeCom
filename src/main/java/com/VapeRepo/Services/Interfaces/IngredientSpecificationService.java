package com.VapeRepo.Services.Interfaces;

import com.VapeRepo.Domain.Ingredientspecification;
//import com.VapeRepo.Domain.Ingredient_Specification;
import com.VapeRepo.Services.BaseService;

import java.util.List;

/**
 * Created by dylan on 9/3/2017.
 */
public interface IngredientSpecificationService  extends BaseService<Ingredientspecification, Integer> {
    public List<Ingredientspecification> getIngredientSpecification(Integer id);
}
