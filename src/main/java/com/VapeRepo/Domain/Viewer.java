package com.VapeRepo.Domain;

//import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Null;


/**
 * Created by dylan on 8/5/2017.
 */
@Entity
public class Viewer /*implements Serializable, Comparable<Viewer>*/{
    private String name;
    private String password;

    @Id
    //@Column(name = "email")
    private String email;











   // @OneToMany(/*mappedBy = "viewer", cascade= CascadeType.ALL,*/fetch=FetchType.EAGER )
//    @OneToMany(targetEntity=Comment.class, mappedBy="comment_id", fetch=FetchType.EAGER)
//    @JoinColumn(name = "comment_id")
    @OneToMany(mappedBy="comment_id")
    //@JoinColumn(name = "comment_id")
    private List<Comment> comment;



















//@OneToMany(/*mappedBy = "viewer", targetEntity=Comment.class,*/ cascade= CascadeType.ALL/*,fetch=FetchType.EAGER*/)         // fix this later
//////@JoinColumn(name="comment_id")
//private List<Comment> comment = new ArrayList();

   /* private List<FavouriteRecipes> favouriteRecipes;*/
    private int rep;                    //  the rep of the viewer, not visible to viewers or mixers  -   determined and visible to Admin only    -    used to see whether suggestions or reports are worth looking into
    private Date date;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public List<Comment> getComment() {
        return comment;
    }
/*
    public List<FavouriteRecipes> getFavouriteRecipes() {
        return favouriteRecipes;
    }
*/
    public int getRep() {
        return rep;
    }

    public Date getDate() {
        return date;
    }

    public Viewer(){}

    public Viewer(Builder builder){
        this.name = builder.name;
        this.password = builder.password;
        this.email = builder.email;
       this.comment = builder.comment;
    /*    this.favouriteRecipes = builder.favouriteRecipes;
    */    this.rep = builder.rep;
        this.date = builder.date;
    }

    /*@Override
    public int compareTo(Viewer viewer) {
        return email.compareTo(viewer.email);
    }
*/
    public static class Builder{

        private String name;
        private String password;
        private String email;
        private List<Comment> comment;
     /*   private List<FavouriteRecipes> favouriteRecipes;

      */  private int rep;
        private Date date;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

//       public Builder comment(Comment/*List<Comment>*/ comment) {
//            if(comment == null){
//                return this;
//            }
//            if(comment != null)
//            this.comment.add(comment);
//
//           //this.comment = comment;
//            return this;
//        }

        public Builder comment(List<Comment> comment) {
//            if(comment == null){
//                return this;
//            }
//            if(comment != null)
//                this.comment.add(comment);

            //this.comment = comment;
            return this;
        }

   /*     public Builder favouriteRecipes(List<FavouriteRecipes> favouriteRecipes) {
            this.favouriteRecipes = favouriteRecipes;
            return this;
        }
*/
        public Builder rep(int rep) {
            this.rep = rep;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }


        public Viewer build(){
            return  new Viewer(this);
        }
    }



    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Viewer)) return false;

        Viewer viewer = (Viewer) o;

        return email.equals(viewer.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    @Override
    public String toString() {
        return "Viewer{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }*/
}
