package com.VapeRepo.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by dylan on 8/5/2017.
 */
@Entity
public class Recipe implements Serializable {
    private String name;
    private String description;
    private Date date;

    @ManyToOne(optional=false)
    private Mixer mixer;

   // @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipe")
   // private List<Ingredient_Specification> ing_spec;

    private int nicMg;

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Ingredientspecification ingredientspecification;

    @OneToOne
    private Recipe revisedRecipe;

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

//    public List<Ingredient_Specification> getIng_spec(){
//        return ing_spec;
//    }

    public int getNicMg() {
        return nicMg;
    }

    public int getRecipe_id() {
        return id;
    }

    public Recipe(){}

    public Recipe(Builder builder){
        this.name = builder.name;
        this.description = builder.description;
        this.date = builder.date;
        this.mixer = builder.mixer;
      //  this.ing_spec = builder.ing_spec;
        this.nicMg = builder.nicMg;
        this.id = builder.recipe_id;
        this.revisedRecipe = builder.revisedRecipe;
    }

    public static class Builder{
        private int recipe_id;
        private String name;
        private String description;
        private Date date;
        private Mixer mixer;
        private int nicMg;
        private Recipe revisedRecipe;

        private List<Ingredientspecification> ing_spec;

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

        public Builder ing_spec(List<Ingredientspecification> ing_spec) {                  // assign ingredients
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

        public Builder recipe_id(int recipe_id) {
            this.recipe_id = recipe_id;
            return this;
        }

        public Builder revisedRecipe(Recipe revisedRecipe) {
            this.revisedRecipe = revisedRecipe;
            return this;
        }

        public Recipe build(){
            return  new Recipe(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;

        Recipe recipe = (Recipe) o;

        return id == recipe.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
