package com.VapeRepo.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by dylan on 8/5/2017.
 */
@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "Viewer_TYPE", discriminatorType = DiscriminatorType.STRING)
//@Table(name="Mixer")
//@DiscriminatorValue("Mixer")
public class Mixer /*extends Viewer*/ implements Serializable {
//    @OneToMany
//    private List<Recipe> recipes;
    //private String recipe = "hidvjkhvd";
    @Id
    private String email;

    @OneToOne
    @PrimaryKeyJoinColumn(name="email", referencedColumnName="email")
    private Viewer viewer;



//    public List<Recipe> getRecipes() {
//        return recipes;
//    }


    public Viewer getViewer() {
        return viewer;
    }

    public Mixer(){}

    public Mixer(Builder builder){

//        this.recipes = builder.recipes;
        this.email = builder.email;
        this.viewer = builder.viewer;
    }

    public static class Builder{
        private Viewer viewer;
        private String email;
//        private List<Recipe> recipes;

//        public Builder recipes(Recipe recipes) {
//            this.recipes.add(recipes);
//            return this;
//        }

//        public Builder recipes(List<Recipe> recipes) {
//            this.recipes = recipes;
//            return this;
//        }

        public Builder viewer(Viewer viewer) {
            this.viewer = viewer;
            this.email = viewer.getEmail();
            return this;
        }

       /* public Builder email(String email) {
            this.email = email;
            return this;
        }*/

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

        return email.equals(mixer.email);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}
