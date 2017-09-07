package com.VapeRepo.Services.Impl;

import com.VapeRepo.Domain.Ingredient;
import com.VapeRepo.Repositories.IngredientRepository;
import com.VapeRepo.Services.Interfaces.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dylan on 9/3/2017.
 */
@Component
public class IngredientServiceImpl implements IngredientService {
    @Autowired
    private IngredientRepository mixerRepository;

    @Override
    public Ingredient save(Ingredient entity) {
        return mixerRepository.save(entity);
    }

    @Override
    public  Ingredient findById(Integer s) {
        return mixerRepository.findOne(s);
    }

    @Override
    public  Ingredient update(Integer s) {
        return null;
    }
}
