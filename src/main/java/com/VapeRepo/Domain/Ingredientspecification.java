package com.VapeRepo.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by dylan on 8/5/2017.
 */
@Entity
public class Ingredientspecification {
    private int percentage;
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(optional=false)
    private Recipe recipe;

    @ManyToOne(optional=false)
    private Ingredient ingredient;

    public int getPercentage() {
        return percentage;
    }

    public int getSpec_id() {
        return id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public Ingredientspecification(){}

    public Ingredientspecification(Builder builder){
        this.percentage = builder.percentage;
        this.id = builder.spec_id;
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

        public Ingredientspecification build(){
            return  new Ingredientspecification(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredientspecification)) return false;

        Ingredientspecification that = (Ingredientspecification) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
