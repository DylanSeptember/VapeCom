package com.VapeRepo.Domain;

/**
 * Created by dylan on 8/5/2017.
 */
public class Ingredient_Specification {
    private int percentage;
    private int spec_id;
    private Recipe recipe;

    private Ingredient ing_id;

    public int getPercentage() {
        return percentage;
    }

    public int getSpec_id() {
        return spec_id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public Ingredient getIng_id() {
        return ing_id;
    }

    public Ingredient_Specification(){}

    public Ingredient_Specification(Builder builder){
        this.percentage = builder.percentage;
        this.spec_id = builder.spec_id;
        this.recipe = builder.recipe;
        this.ing_id = builder.ing_id;
    }

    public static class Builder{

        private int percentage;
        private int spec_id;
        private Recipe recipe;
        private Ingredient ing_id;

        public Builder percentage(int percentage) {
            this.percentage = percentage;
            return this;
        }

        public Builder id(int spec_id) {
            this.spec_id = spec_id;
            return this;
        }

        public Builder recipe(Recipe recipe) {                      //  assign recipe to which ingredient belngs to
            this.recipe = recipe;
            return this;
        }

        public Builder ing_id(Ingredient ing_id) {                      //  assign recipe to which ingredient belngs to
            this.ing_id = ing_id;
            return this;
        }

        public Ingredient_Specification build(){
            return  new Ingredient_Specification(this);
        }
    }
}
