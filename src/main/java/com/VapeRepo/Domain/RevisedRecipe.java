package com.VapeRepo.Domain;

/**
 * Created by dylan on 8/7/2017.
 */
public class RevisedRecipe extends Recipe{
    private Recipe recipe;

    public Recipe getRecipe() {
        return recipe;
    }

    public RevisedRecipe(){}

    public RevisedRecipe(Builder builder){
        this.recipe = builder.recipe;

    }

    public static class Builder{

        private Recipe recipe;

        public Builder recipe(Recipe recipe) {
            this.recipe = recipe;
            return this;
        }

        public RevisedRecipe build(){
            return  new RevisedRecipe(this);
        }
    }
}
