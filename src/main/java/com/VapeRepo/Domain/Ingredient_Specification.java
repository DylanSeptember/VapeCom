package com.VapeRepo.Domain;

/**
 * Created by dylan on 8/5/2017.
 */
public class Ingredient_Specification {
    private int percentage;
   /* private String brand;
    private String description;*/
    private int spec_id;
  //  private String recipe;
    private Recipe recipe;

    private Ingredient ing_id;

    public int getPercentage() {
        return percentage;
    }

   /* public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }*/

    public int getSpec_id() {
        return spec_id;
    }

    public Recipe getRecipe() {
        return recipe;
    }
   /* public String getRecipe() {
        return recipe;
    }*/

    public Ingredient getIng_id() {
        return ing_id;
    }

    public Ingredient_Specification(){}

    public Ingredient_Specification(Builder builder){
        this.percentage = builder.percentage;
      /*  this.brand = builder.brand;
        this.description = builder.description;*/
        this.spec_id = builder.spec_id;
        this.recipe = builder.recipe;
     //   this.recipe = builder.recipe;
        this.ing_id = builder.ing_id;
    }

    public static class Builder{

        private int percentage;
      /*  private String brand;
        private String description;*/
      //  private String recipe;
        private int spec_id;
        private Recipe recipe;
        private Ingredient ing_id;

        public Builder percentage(int percentage) {
            this.percentage = percentage;
            return this;
        }

       /* public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }*/

        public Builder id(int spec_id) {
            this.spec_id = spec_id;
            return this;
        }

        public Builder recipe(Recipe recipe) {                      //  assign recipe to which ingredient belngs to
            this.recipe = recipe;
            return this;
        }

        public Builder ing_id(Ingredient ing_id) {                      //  assign recipe to which ingredient belngs to
            this.ing_id = ing_id;
            return this;
        }
      /*  public Builder recipe(String recipe) {
            this.recipe = recipe;
            return this;
        }*/


        public Ingredient_Specification build(){
            return  new Ingredient_Specification(this);
        }
    }
}
