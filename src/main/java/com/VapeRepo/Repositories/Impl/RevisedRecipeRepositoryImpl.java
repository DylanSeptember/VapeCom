//package com.VapeRepo.Repositories.Impl;
//
//import com.VapeRepo.Domain.Recipe;
//import com.VapeRepo.Domain.RevisedRecipe;
//import com.VapeRepo.Domain.Suggestion;
//import com.VapeRepo.Repositories.RevisedRecipeRepository;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by dylan on 8/13/2017.
// */
//public class RevisedRecipeRepositoryImpl /*implements RevisedRecipeRepository*/ {
//
//    Map<Recipe, RevisedRecipe> revisedRecipeTable;
//
//    public RevisedRecipeRepositoryImpl(){
//        revisedRecipeTable = new HashMap<Recipe, RevisedRecipe>();
//    }
//
//    public RevisedRecipe create(RevisedRecipe revisedRecipe) {
//     revisedRecipeTable.put(revisedRecipe.getRecipe(), revisedRecipe);
//     RevisedRecipe savedRecipe = revisedRecipeTable.get(revisedRecipe.getRecipe());
//     return savedRecipe;
//    }
//
//    public RevisedRecipe read(Recipe recipe) {
//        RevisedRecipe revisedRecipe = revisedRecipeTable.get(recipe);
//        System.out.println(" The RevisedRecipe Object is " + revisedRecipe);
//
//        return revisedRecipe;
//    }
//
//    public RevisedRecipe update(RevisedRecipe revisedRecipe) {
//        revisedRecipeTable.put(revisedRecipe.getRecipe(), revisedRecipe);
//        RevisedRecipe savedRevisedRecipe = revisedRecipeTable.get(revisedRecipe.getRecipe());
//        return savedRevisedRecipe;
//    }
//
//    public void delete(Recipe recipe) {
//        revisedRecipeTable.remove(recipe);
//    }
//}
