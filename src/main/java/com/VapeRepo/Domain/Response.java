package com.VapeRepo.Domain;

/**
 * Created by dylan on 8/7/2017.
 */
public class Response extends Comment{
    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public Response(){}

    public Response(Builder builder){

        this.comment = builder.comment;
    }

    public static class Builder{

        private Comment comment;

        public Builder recipes(Comment comment) {
            this.comment = comment;
            return this;
        }



        public Response build(){
            return  new Response(this);
        }
    }

}
