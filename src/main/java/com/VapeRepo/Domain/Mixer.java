package com.VapeRepo.Domain;

import java.util.Date;
import java.util.List;

/**
 * Created by dylan on 8/5/2017.
 */
public class Mixer extends Viewer{

    private List<Recipe> recipes;

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public Mixer(){}

    public Mixer(Builder builder){

         this.recipes = builder.recipes;
    }

    public static class Builder{

        private List<Recipe> recipes;

        public Builder recipes(List<Recipe> recipes) {
            this.recipes = recipes;
            return this;
        }



        public Mixer build(){
            return  new Mixer(this);
        }
    }
}
