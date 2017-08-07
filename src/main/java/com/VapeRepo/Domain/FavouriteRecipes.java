package com.VapeRepo.Domain;

/**
 * Created by dylan on 8/7/2017.
 */
public class FavouriteRecipes {
    private Recipe recipe;
    private Viewer viewer;

    public Recipe getRecipe() {
        return recipe;
    }

    public Viewer getViewer() {
        return viewer;
    }

    public FavouriteRecipes() {
    }

    public FavouriteRecipes(Builder builder){
        this.recipe = builder.recipe;
        this.viewer = builder.viewer;
    }

    public static class Builder{

        private Recipe recipe;
        private Viewer viewer;

        public Builder recipe(Recipe recipe) {
            this.recipe = recipe;
            return this;
        }

        public Builder viewer(Viewer viewer) {
            this.viewer = viewer;
            return this;
        }

        public FavouriteRecipes build(){
            return  new FavouriteRecipes(this);
        }
    }
}
