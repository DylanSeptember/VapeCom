package com.VapeRepo.Domain;

import java.util.Date;
import java.util.List;

/**
 * Created by dylan on 8/5/2017.
 */
public class Mixer extends Viewer{

   /* private String name;
    private String password;*/
        private List<Recipe> recipes;

   /* public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }*/



    public List<Recipe> getRecipes() {
        return recipes;
    }

    public Mixer(){}

    public Mixer(Builder builder){
       /* this.name = builder.name;
        this.password = builder.password;*/

        this.recipes = builder.recipes;
    }

    public static class Builder{

       /* private String name;
        private String password;*/

        private List<Recipe> recipes;
       /* public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }*/

        public Builder recipes(List<Recipe> recipes) {
            this.recipes = recipes;
            return this;
        }



        public Mixer build(){
            return  new Mixer(this);
        }
    }
}
