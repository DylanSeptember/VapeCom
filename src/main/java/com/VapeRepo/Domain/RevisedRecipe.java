package com.VapeRepo.Domain;

/**
 * Created by dylan on 8/7/2017.
 */
public class RevisedRecipe /*extends Recipe*/{
    private Recipe recipe;
    private Recipe baseRecipe;

    public Recipe getRecipe() {
        return recipe;
    }

    public Recipe getBaseRecipe() {
        return baseRecipe;
    }

    public RevisedRecipe(){}

    public RevisedRecipe(Builder builder){
        this.recipe = builder.recipe;
        this.baseRecipe = builder.baseRecipe;
    }

    public static class Builder{
        private Recipe baseRecipe;
        private Recipe recipe;

        public Builder recipe(Recipe recipe) {
            this.recipe = recipe;
            return this;
        }

        public Builder baseRecipe(Recipe baseRecipe) {
            this.baseRecipe = baseRecipe;
            return this;
        }

        public RevisedRecipe build(){
            return  new RevisedRecipe(this);
        }
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RevisedRecipe that = (RevisedRecipe) o;

        return getRecipe() != null ? getRecipe().equals(that.getRecipe()) : that.getRecipe() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getRecipe() != null ? getRecipe().hashCode() : 0);
        return result;
    }*/

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RevisedRecipe)) return false;
        if (!super.equals(o)) return false;

        RevisedRecipe that = (RevisedRecipe) o;

        return recipe.equals(that.recipe);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + recipe.hashCode();
        return result;
    }*/
}
