package com.VapeRepo.Domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dylan on 8/7/2017.
 */
public class Response implements Serializable {

    private int response_id;
    private Date responseDate;
    private String description;
    private Recipe recipe;
    private Viewer viewer;

    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public int getResponse_id() {
        return response_id;
    }

    public Date getResponseDate() {
        return responseDate;
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

    public Response(){}

    public Response(Builder builder){

        this.comment = builder.comment;
        this.response_id = builder.response_id;
        this.responseDate = builder.responseDate;
        this.description = builder.description;
        this.recipe = builder.recipe;
        this.viewer = builder.viewer;
    }

    public static class Builder{

        private int response_id;
        private Date responseDate;
        private String description;
        private Recipe recipe;
        private Viewer viewer;
        private Comment comment;

        public Builder recipes(Comment comment) {
            this.comment = comment;
            return this;
        }

        public Builder response_id(int response_id) {
            this.response_id = response_id;
            return this;
        }

        public Builder responseDate(Date responseDate) {
            this.responseDate = responseDate;
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



        public Response build(){
            return  new Response(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response)) return false;

        Response response = (Response) o;

        return response_id == response.response_id;
    }

    @Override
    public int hashCode() {
        return response_id;
    }
}
