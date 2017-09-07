package com.VapeRepo.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by dylan on 8/5/2017.
 */
@Entity
public class Ingredient {
    @Id
    @GeneratedValue
    private int ingredient_id;
    private String brand;
    private String description;

    public int getIngredient_id() {
        return ingredient_id;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public Ingredient(){}

    public Ingredient(Builder builder){
        this.ingredient_id = builder.ingredient_id;

        this.brand = builder.brand;
        this.description = builder.description;
     }

    public static class Builder{

        private int ingredient_id;

        private String brand;
        private String description;

        public Builder ingredient_id(int ingredient_id) {
            this.ingredient_id = ingredient_id;
            return this;
        }


        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Ingredient build(){
            return  new Ingredient(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient)) return false;

        Ingredient that = (Ingredient) o;

        return ingredient_id == that.ingredient_id;
    }

    @Override
    public int hashCode() {
        return ingredient_id;
    }
}
