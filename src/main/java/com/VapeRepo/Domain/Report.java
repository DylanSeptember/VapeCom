package com.VapeRepo.Domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by dylan on 8/7/2017.
 */
@Entity
public class Report implements Serializable {
    @Id
    @GeneratedValue
    private int rep_id;
    private String description;

    @ManyToOne
    private Viewer viewer;

    public int getRep_id() {
        return rep_id;
    }

    public String getDescription() {
        return description;
    }

    public Viewer getViewer() {
        return viewer;
    }

    public Report(){}

    public Report(Builder builder){
        this.description = builder.description;

        this.rep_id = builder.rep_id;
        this.viewer = builder.viewer;

    }

    public static class Builder{

        private int rep_id;
        private String description;
        private Viewer viewer;

        public Builder description(String message) {
            this.description = message;
            return this;
        }


        public Builder rep_id(int rep_id) {
            this.rep_id = rep_id;
            return this;
        }

        public Builder viewer(Viewer viewer) {
            this.viewer = viewer;
            return this;
        }

        public Report build(){
            return  new Report(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Report)) return false;

        Report report = (Report) o;

        return rep_id == report.rep_id;
    }

    @Override
    public int hashCode() {
        return rep_id;
    }
}
