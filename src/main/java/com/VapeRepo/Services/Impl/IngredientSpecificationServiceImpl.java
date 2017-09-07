package com.VapeRepo.Services.Impl;

///import com.VapeRepo.Domain.IngredientSpecification;
//import com.VapeRepo.Domain.Ingredient_Specification;
import com.VapeRepo.Domain.Ingredientspecification;
import com.VapeRepo.Repositories.Ingredient_SpecificationRepository;
import com.VapeRepo.Services.Interfaces.IngredientSpecificationService;
//import com.VapeRepo.Services.Interfaces.Ingredient_SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by dylan on 9/3/2017.
 */
@Component
public class IngredientSpecificationServiceImpl  implements IngredientSpecificationService {

    @Autowired
    private Ingredient_SpecificationRepository ingredient_SpecificationRepository;

    @Override
    public Ingredientspecification save(Ingredientspecification entity) {
        return ingredient_SpecificationRepository.save(entity);
    }

    @Override
    public Ingredientspecification findById(Integer s) {
        return ingredient_SpecificationRepository.findOne(s);
    }

    @Override
    public Ingredientspecification update(Integer s) {
        return null;
    }

    @Override
    public List<Ingredientspecification> getIngredientSpecification(Integer id){

//        List<Comment> comments = new ArrayList<>();
//        commentRepository.findByViewerId(id)
        return ingredient_SpecificationRepository.findByRecipeId(id);
    }
}
