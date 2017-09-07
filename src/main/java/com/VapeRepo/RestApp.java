package com.VapeRepo;

/*import com.VapeRepo.Domain.Comment;
import com.VapeRepo.Domain.FavouriteRecipes;*/
import com.VapeRepo.Domain.*;
import com.VapeRepo.Factories.*;
import com.VapeRepo.Services.Impl.*;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


/**
 * Created by dylan on 8/17/2017.
 */
@Controller
//@EnableAutoConfiguration
@RequestMapping(path="/secrest")
public class RestApp {

    @Autowired
    private ViewerServiceImpl viewerService;

    @Autowired
    private SuggestionServiceImpl suggestionService;

    @Autowired
    private CommentServiceImpl commentService;

    @Autowired
    private MixerServiceImpl mixerService;

    @Autowired
    private RecipeServiceImpl recipeService;

    @Autowired
    private IngredientServiceImpl ingredientService;

    @Autowired
    private ReportServiceImpl reportService;

    @Autowired
    private ResponseServiceImpl responseService;

    @Autowired
    private IngredientSpecificationServiceImpl ingredient_SpecificationService;

   /* @Autowired
    private Ingredient_SpecificationServiceImpl ingredient_SpecificationService;*/



    Viewer temp;        // testing purpose only
    Mixer mTemp;
    Comment ctemp;

    HashMap<String, Object> values;
    HashMap<String, Object> vValues;

    Date date;

    @GetMapping(path="/addViewer/{name}/{password}/{email}/{rep}")
    public @ResponseBody
    String addViewer(@PathVariable String name, @PathVariable String password, @PathVariable String email, @PathVariable Integer rep){
date = new Date();
        values = new HashMap<String, Object>();
        values.put("name", name);//name);
        values.put("password", password);//password);
        values.put("email",email);//email);
        values.put("rep", rep);//100);
        values.put("date",date); //date);
        values.put("comment", null);




        Viewer viewer = ViewerFactory.buildViewer( values);
        temp = viewer;
        //Comment com = viewer.getComment().get(0);
        viewerService.save(viewer);
        return new Gson().toJson(viewer);
    }

    @GetMapping(path="/addSuggestion/{description}/{email}")
    public @ResponseBody
    String addSuggestion(@PathVariable String description, @PathVariable String email){
date = new Date();
        values = new HashMap<String, Object>();
        values.put("description", description);//name);
       // values.put("sug_id", sugId);//password);
        values.put("date", date);//email);
        values.put("mixer", mixerService.findById(email));//email);

        Suggestion suggestion = SuggestionFactory.buildSuggestion( values);
        suggestionService.save(suggestion);
        return new Gson().toJson(suggestion);
    }

    @GetMapping(path="/addComment/{description}/{email}/{recipe}")
    public @ResponseBody
    String addComment(/*@PathVariable Integer comment_id, */@PathVariable String description, @PathVariable String email, @PathVariable Integer recipe){
date = new Date();
        values = new HashMap<String, Object>();
        values.put("description", description);//password);
        values.put("commentDate", date);//email);
        values.put("viewer", viewerService.findById(email) /*temp*/);
        values.put("recipe", recipeService.findById(recipe));

        Comment comment = CommentFactory.buildComment( values);

        commentService.save(comment);
         return new Gson().toJson(comment);
    }

    @GetMapping(path="/test")
    public @ResponseBody
    String test(){

        Viewer viewer = viewerService.findById(temp.getEmail());
        vValues = new HashMap<String, Object>();
        vValues.put("name", viewer.getName());//name);
        vValues.put("password", viewer.getPassword());//password);
        vValues.put("email",viewer.getEmail());//email);
        vValues.put("rep", viewer.getRep());//100);
        vValues.put("date",viewer.getDate()); //date);
        vValues.put("comment", ctemp);

        //if(ctemp != null)
            viewer = ViewerFactory.buildViewer( vValues);//The error is the entity doesnt exist at this point. Do this after the comment is added to database

        //Mixer mixer = MixerFactory.buildMixer(viewerService.findById(email));
        //  Mixer mixer = MixerFactory.buildMixer(values);
        viewerService.save(viewer);
        return new Gson().toJson(viewer);

    }

   /*@GetMapping(path="/addIngredient_Specification/{recipeId}/{ingredientId}/{percentage}")
    public @ResponseBody
    String addIngredient_Specification(@PathVariable Integer recipeId, @PathVariable Integer ingerdeintId, @PathVariable int percentage){

        values = new HashMap<String, Object>();
        values.put("recipe", recipeId);//password);
        values.put("ingredient", ingerdeintId);//email);
        values.put("percentage", percentage);

        ingredient_Specification ingredient_Specification = Ingredient_SpecificationFactory.buildIngredient_Specification( values);

        Ingredient_Specification.save(ingredient_Specification);
        return new Gson().toJson(Ingredient_Specification);
    }*/


    @GetMapping(path="/addMixer/{email}")
    public @ResponseBody
    String addMixer(@PathVariable String email /*@PathVariable String name, @PathVariable String password, @PathVariable String email, @PathVariable Integer rep*/){


        Mixer mixer = MixerFactory.buildMixer(viewerService.findById(email));
      //  Mixer mixer = MixerFactory.buildMixer(values);
        mixerService.save(mixer);
        return new Gson().toJson(mixer);

//        values = new HashMap<String, Object>();
//        values.put("viewer", viewerService.findById(email));//name);
//        values.put("recipes", recipeService.findById(recipeId));//password);
//       /* values.put("email",date);//email);
//        values.put("mixer", v);//100);*/
//
//
//        Mixer mixer = MixerFactory.buildMixer(values);
//        //  Mixer mixer = MixerFactory.buildMixer(values);
//        mixerService.save(mixer);
//        return new Gson().toJson(mixer);

    }


    @GetMapping(path="/addRecipe/{name}/{description}/{email}/{nicMg}/{id}")
    public @ResponseBody
    String addRecipe(@PathVariable String name, @PathVariable String description, @PathVariable String email, @PathVariable Integer nicMg, @PathVariable Integer id){

        Mixer v = mixerService.findById(email);
date = new Date();
        values = new HashMap<String, Object>();
        values.put("name", name);//name);
        values.put("description", description);//password);
        //values.put("email",date);//email);
        values.put("mixer", v);//100);
        values.put("date",date); //date);
        values.put("nicMg", nicMg);
        values.put("revisedRecipe", recipeService.findById(id));
        //values.put("ing_spec", ingredient_SpecificationService.getIngredientSpecification(id));



        Recipe recipe = RecipeFactory.buildRecipe( values);
        recipeService.save(recipe);
        return new Gson().toJson(recipe);
    }

    @GetMapping(path="/addIngredient/{brand}/{description}")
    public @ResponseBody
    String addIngredient(@PathVariable String brand, @PathVariable String description){

       // Mixer v = mixerService.findById(email);

        values = new HashMap<String, Object>();
        values.put("brand", brand);//name);
        values.put("description", description);//password);

        Ingredient ingredient = IngredientFactory.buildIngredient( values);
        ingredientService.save(ingredient);
        return new Gson().toJson(ingredient);
    }

    @GetMapping(path="/addReport/{description}/{email}")
    public @ResponseBody
    String addReport(@PathVariable String description, @PathVariable String email){

        // Mixer v = mixerService.findById(email);

        values = new HashMap<String, Object>();
        values.put("viewer", viewerService.findById(email));//name);
        values.put("description", description);//password);

        Report report = ReportFactory.buildReport( values);
        reportService.save(report);
        return new Gson().toJson(report);
    }

    @GetMapping(path="/addResponse/{description}/{email}/{commentId}")
    public @ResponseBody
    String addResponse(@PathVariable String description, @PathVariable String email, @PathVariable Integer commentId){
date = new Date();
        values = new HashMap<String, Object>();

        values.put("responseDate", date);//password);
        values.put("description", description);//password);
        values.put("viewer", viewerService.findById(email));//name);
        values.put("comment", commentService.findById(1));//name);

        Response response = ResponseFactory.buildResponse( values);
        responseService.save(response);
        return new Gson().toJson(response);
    }

    @GetMapping(path="/addIngredient_Specification/{percentage}/{recipeId}/{ingredientId}")
    public @ResponseBody
    String addIngredient_Specification(@PathVariable Integer percentage, @PathVariable Integer ingredientId, @PathVariable Integer recipeId){

        values = new HashMap<String, Object>();

        values.put("percentage", percentage);//password);
        values.put("recipe", recipeService.findById(recipeId));//name);
        values.put("ingredient", ingredientService.findById(ingredientId));//name);


        Ingredientspecification ingredient_Specification = Ingredient_SpecificationFactory.buildIngredientSpecification( values);
        ingredient_SpecificationService.save(ingredient_Specification);
        return new Gson().toJson(ingredient_Specification);
    }
//////////////////////////////////hardcode relationships










//    @GetMapping(path="/readViewer/{email}")
//    public @ResponseBody
//    Viewer readViewer(@PathVariable String email){
//
//        Comment com = viewerService.findById(email).getComment().get(0);
//
//      return viewerService.findById(email);
//
//       // return new Gson().toJson(ingredient_Specification);
//    }

    @GetMapping(path="/getComments/{id}")
    public @ResponseBody
    List<Comment> getComments(@PathVariable String id){

        return commentService.getComment(id);
        // return new Gson().toJson(ingredient_Specification);
    }

    @GetMapping(path="/getResponse/{id}")
    public @ResponseBody
    List<Response> getResponse(@PathVariable Integer id){

        return responseService.getResponse(id);
        // return new Gson().toJson(ingredient_Specification);
    }

    @GetMapping(path="/getRComments/{id}")
    public @ResponseBody
    List<Comment> getRComments(@PathVariable Integer id){

        return commentService.getCommentByRecipe(id);
        // return new Gson().toJson(ingredient_Specification);
    }

    @GetMapping(path="/getIngredient_Specifacation/{id}")
    public @ResponseBody
    List<Ingredientspecification> getIngredient_Specification(@PathVariable Integer id){

        return ingredient_SpecificationService.getIngredientSpecification(id);
        // return new Gson().toJson(ingredient_Specification);
    }

    @GetMapping(path="/readSuggestion/{id}")
    public @ResponseBody
    Suggestion readSuggestion(@PathVariable Integer id){

        return suggestionService.findById(id);
        // return new Gson().toJson(ingredient_Specification);
    }

    @GetMapping(path="/readResponse/{id}")
    public @ResponseBody
    Response readResponse(@PathVariable Integer id){

        return responseService.findById(id);
        // return new Gson().toJson(ingredient_Specification);
    }

    @GetMapping(path="/readReport/{id}")
    public @ResponseBody
    Report readReport(@PathVariable Integer id){

        return reportService.findById(id);
        // return new Gson().toJson(ingredient_Specification);
    }

    @GetMapping(path="/readRecipe/{id}")
    public @ResponseBody
    Recipe readRecipe(@PathVariable Integer id){

        return recipeService.findById(id);
        // return new Gson().toJson(ingredient_Specification);
    }

    @GetMapping(path="/readMixer/{email}")
    public @ResponseBody
    Mixer readMixer(@PathVariable String email){

        return mixerService.findById(email);
        // return new Gson().toJson(ingredient_Specification);
    }

    @GetMapping(path="/readIngredientSpec/{id}")
    public @ResponseBody
    Ingredientspecification readIngredient_Specification(@PathVariable Integer id){

        return ingredient_SpecificationService.findById(id);
        // return new Gson().toJson(ingredient_Specification);
    }

    @GetMapping(path="/readIngredient/{id}")
    public @ResponseBody
    Ingredient readIngredient(@PathVariable Integer id){

        return ingredientService.findById(id);
        // return new Gson().toJson(ingredient_Specification);
    }

    @GetMapping(path="/readComment/{id}")
    public @ResponseBody
    Comment readComment(@PathVariable Integer id){

        return commentService.findById(id);
        // return new Gson().toJson(ingredient_Specification);
    }


    /*@GetMapping(path="/readViewer/{email}")
    public @ResponseBody
    Viewer readViewer(@PathVariable String email){

        return viewerService.findById(email);
        // return new Gson().toJson(ingredient_Specification);
    }*/
}
