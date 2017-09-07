package com.VapeRepo.Services.Impl;

import com.VapeRepo.Domain.Recipe;
import com.VapeRepo.Repositories.Impl.RecipeRepositoryImpl;
import com.VapeRepo.Repositories.RecipeRepository;
import com.VapeRepo.Services.Interfaces.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dylan on 8/14/2017.
 */
@Component
public class RecipeServiceImpl implements RecipeService{

    @Autowired
    private  RecipeRepository mixerRepository;

    @Override
    public  Recipe save( Recipe entity) {
        return mixerRepository.save(entity);
    }

    @Override
    public  Recipe findById(Integer s) {
        return mixerRepository.findOne(s);
    }

    @Override
    public  Recipe update(Integer s) {
        return null;
    }



   /* RecipeRepository repository;

    public RecipeServiceImpl(){
        // service = new ViewerServiceImpl();
        repository = new RecipeRepositoryImpl();
    }

    public Recipe create(Recipe recipe) {
        return repository.create(recipe);
    }

    public Recipe read(int recipe_id) {
        return repository.read(recipe_id);
    }

    public Recipe update(Recipe recipe) {
        return repository.update(recipe);
    }

    public void delete(int recipe_id) {
        repository.delete(recipe_id);

    }*/
}
