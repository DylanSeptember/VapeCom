package com.VapeRepo.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by dylan on 8/5/2017.
 */

/////////////////////////////////something wrong here///////////////////////////doesnt play with other entities
@Entity
public class Comment /*implements Serializable*/ {
    @Id
    @GeneratedValue
    private int comment_id;

    private Date commentDate;
    private String description;

    @ManyToOne(optional=false)
    private Recipe recipe;

    @ManyToOne(optional=false)
  // @JoinColumn(name = "viewer")
    private Viewer viewer;












    public int getComment_id() {
        return comment_id;
    }

    public Date getDate() {
        return commentDate;
    }

    public String getDescription() {
        return description;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public Viewer getViewer() {
        return viewer;
    }

    public Comment(){}

    public Comment(Builder builder){
        this.comment_id = builder.comment_id;
        this.commentDate = builder.commentDate;
        this.description = builder.description;
        this.recipe = builder.recipe;
        this.viewer = builder.viewer;
    }

    public static class Builder{

        private int comment_id;
        private Date commentDate;
        private String description;
        private Recipe recipe;
        private Viewer viewer;

        public Builder comment_id(int comment_id) {
            this.comment_id = comment_id;
            return this;
        }

        public Builder commentDate(Date commentDate) {
            this.commentDate = commentDate;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder recipe(Recipe recipe) {
            this.recipe = recipe;
            return this;
        }

        public Builder viewer(Viewer viewer) {
            this.viewer = viewer;
            return this;
        }

        public Comment build(){
            return  new Comment(this);
        }
    }



   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;

        Comment comment = (Comment) o;

        return comment_id == comment.comment_id;
    }

    @Override
    public int hashCode() {
        return comment_id;
    }*/
}
