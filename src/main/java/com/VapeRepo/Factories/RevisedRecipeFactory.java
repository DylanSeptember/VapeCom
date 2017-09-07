//package com.VapeRepo.Factories;
//
//import com.VapeRepo.Domain.Recipe;
//import com.VapeRepo.Domain.RevisedRecipe;
//
//import java.util.Map;
//
///**
// * Created by dylan on 8/13/2017.
// */
//public class RevisedRecipeFactory {
//    public static RevisedRecipe getRecipe(Map<String, Object> values){
//
//        RevisedRecipe revisedRecipe = new RevisedRecipe.Builder()
//                .recipe((Recipe) values.get("recipe"))
//                .baseRecipe((Recipe) values.get("revisedRecipe"))
//                .build();
//        return revisedRecipe;
//    }
//}
