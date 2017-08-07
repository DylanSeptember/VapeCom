package com.VapeRepo.Domain;

import java.util.Date;

/**
 * Created by dylan on 8/5/2017.
 */
public class Comment {
    private int comment_id;
    private Date commentDate;
    private String description;
   /* private String recipe;
    private String viewer;*/
    private Recipe recipe;
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

   /* public String getRecipe() {
        return recipe;
    }

    public String getViewer() {
        return viewer;
    }*/

    public Recipe getRecipe() {
        return recipe;
    }

    public Viewer getViewer() {
        return viewer;
    }

    private Comment(){}

    public Comment(Builder builder){
        this.comment_id = builder.comment_id;
        this.commentDate = builder.commentDate;
        this.description = builder.description;
        /*  this.recipe = builder.recipe;
        this.viewer = builder.viewer;*/
        this.recipe = builder.recipe;
        this.viewer = builder.viewer;
    }

    public static class Builder{

        private int comment_id;
        private Date commentDate;
        private String description;
       /* private String recipe;
        private String viewer;*/
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

       /* public Builder recipe(String recipe) {
            this.recipe = recipe;
            return this;
        }

        public Builder viewer(String viewer) {
            this.viewer = viewer;
            return this;
        }*/

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

}
