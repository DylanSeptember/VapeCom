package com.VapeRepo.Repositories;

//import com.VapeRepo.Domain.IngredientSpecification;
//import com.VapeRepo.Domain.Ingredient_Specification;
import com.VapeRepo.Domain.Ingredientspecification;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by dylan on 9/3/2017.
 */
public interface Ingredient_SpecificationRepository extends CrudRepository<Ingredientspecification, Integer> {
    public List<Ingredientspecification> findByRecipeId(Integer id);
}



