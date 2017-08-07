package com.VapeRepo.Domain;

import java.util.Date;
import java.util.List;

/**
 * Created by dylan on 8/5/2017.
 */
public class Recipe {
    private String name;
    private String description;
    private Date date;
    private Mixer mixer;
    private List<Ingredient_Specification> ing_spec;
    private int nicMg;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Mixer getMixer() {               //  reference recipe mixer
        return mixer;
    }

    public Date getDate() {
        return date;
    }

    public List<Ingredient_Specification> getIng_spec(){
        return ing_spec;
    }

    public int getNicMg() {
        return nicMg;
    }

    public Recipe(){}

    public Recipe(Builder builder){
        this.name = builder.name;
        this.description = builder.description;
        this.date = builder.date;
        this.mixer = builder.mixer;
        this.ing_spec = builder.ing_spec;
        this.nicMg = builder.nicMg;
    }

    public static class Builder{

        private String name;
        private String description;
        private Date date;
        private Mixer mixer;
        private int nicMg;

        private List<Ingredient_Specification> ing_spec;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder mixer(Mixer mixer) {                  // assign recipe mixer
            this.mixer = mixer;
            return this;
        }

        public Builder ing_spec(List<Ingredient_Specification> ing_spec) {                  // assign ingredients
            this.ing_spec = ing_spec;
            return this;
        }

       public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Builder nicMg(int nicMg) {
            this.nicMg = nicMg;
            return this;
        }

        public Recipe build(){
            return  new Recipe(this);
        }
    }
}
