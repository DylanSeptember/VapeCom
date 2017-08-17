package com.VapeRepo.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by dylan on 8/5/2017.
 */
@Entity
public class Mixer /*extends Viewer */implements Serializable {

    private List<Recipe> recipes;
    @Id
    private Viewer viewer;

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public Viewer getViewer() {
        return viewer;
    }

    public Mixer(){}

    public Mixer(Builder builder){

         this.recipes = builder.recipes;
         this.viewer = builder.viewer;
    }

    public static class Builder{
        private Viewer viewer;
        private List<Recipe> recipes;

        public Builder recipes(List<Recipe> recipes) {
            this.recipes = recipes;
            return this;
        }

        public Builder viewer(Viewer viewer) {
            this.recipes = recipes;
            return this;
        }


        public Mixer build(){
            return  new Mixer(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mixer)) return false;
        if (!super.equals(o)) return false;

        Mixer mixer = (Mixer) o;

        return viewer.equals(mixer.viewer);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + viewer.hashCode();
        return result;
    }
}
