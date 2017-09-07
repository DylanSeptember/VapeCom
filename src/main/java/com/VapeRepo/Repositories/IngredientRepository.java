package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dylan on 9/3/2017.
 */
public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {
}
