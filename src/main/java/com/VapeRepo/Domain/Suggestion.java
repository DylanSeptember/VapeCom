package com.VapeRepo.Domain;

import java.util.Date;

/**
 * Created by dylan on 8/7/2017.
 */
public class Suggestion {
    private String description;         //      mixer will have the ability to make suggestions to add ingredients to database of ingredients or any changes to the system
    private Mixer mixer;
    private Date date;
    private int sug_id;


    public String getDescription() {
        return description;
    }

    public Mixer getMixer() {
        return mixer;
    }

    public Date getDate() {
        return date;
    }

    public int getSug_id() {
        return sug_id;
    }

    public Suggestion(){}

    public Suggestion(Builder builder){
        this.description = builder.description;

        this.mixer = builder.mixer;
        this.date = builder.date;
        this.sug_id = builder.sug_id;
    }

    public static class Builder{

        private String description;
        private Mixer mixer;
        private Date date;
        private int sug_id;

        public Builder description(String message) {
            this.description = message;
            return this;
        }


        public Builder mixer(Mixer mixer) {
            this.mixer = mixer;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Builder sug_id(int sug_id) {
            this.sug_id = sug_id;
            return this;
        }

        public Suggestion build(){
            return  new Suggestion(this);
        }
    }
}
