package com.VapeRepo.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by dylan on 8/5/2017.
 */
@Entity
public class IngredientSpecification {
    private int percentage;
    @Id
    @GeneratedValue
    private int spec_id;

    @ManyToOne
    private Recipe recipe;

    @ManyToOne
    private Ingredient ingredient;

    public int getPercentage() {
        return percentage;
    }

    public int getSpec_id() {
        return spec_id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public IngredientSpecification(){}

    public IngredientSpecification(Builder builder){
        this.percentage = builder.percentage;
        this.spec_id = builder.spec_id;
        this.recipe = builder.recipe;
        this.ingredient = builder.ingredient;
    }

    public static class Builder{

        private int percentage;
        private int spec_id;
        private Recipe recipe;
        private Ingredient ingredient;

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

        public Builder ingredient(Ingredient ingredient) {                      //  assign recipe to which ingredient belngs to
            this.ingredient = ingredient;
            return this;
        }

        public IngredientSpecification build(){
            return  new IngredientSpecification(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IngredientSpecification)) return false;

        IngredientSpecification that = (IngredientSpecification) o;

        return spec_id == that.spec_id;
    }

    @Override
    public int hashCode() {
        return spec_id;
    }
}
