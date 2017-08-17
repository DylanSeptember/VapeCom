package com.VapeRepo.Repositories.Impl;

import com.VapeRepo.Domain.Comment;
import com.VapeRepo.Domain.FavouriteRecipes;
import com.VapeRepo.Domain.Recipe;
import com.VapeRepo.Domain.Viewer;
import com.VapeRepo.Factories.ViewerFactory;
import com.VapeRepo.Repositories.ViewerRepository;
//import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by dylan on 8/14/2017.
 */
public class ViewerRepositoryImplTest {

  /*  Map<String, Object> values;
    ViewerRepository repository;
  /*  Mixer mixer;*/
  //  Date date;
    /*Suggestion suggestion;*/
 /* List<FavouriteRecipes> favs;
  List<Comment> comments;
Viewer viewer;


    @BeforeMethod
    public void setUp() throws Exception{

        repository = new ViewerRepositoryImpl();
        values = new HashMap<String, Object>();

        values.put("name", "Dylan");
        values.put("password", "Master01");
        values.put("email", "dylan@gmail.com");
        values.put("comment", comments);
        values.put("favouriteRecipes", favs);
        values.put("rep", 100);
        values.put("date", date);
       /* values.put("password", mixer);
        values.put("email", date);
        values.put("comment", 845);*/


 /*       viewer = ViewerFactory.getViewer(values);
        repository.create(viewer);

    }

    @Test
    public void create() throws Exception {
        // i++;
        //Suggestion suggestion = SuggestionFactory.getSuggestion(values);
        repository.create(viewer);
        Viewer createdViewer = repository.read("dylan@gmail.com");
        assertEquals(100, createdViewer.getRep());

        // System.out.println("create" + i);

    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        // i++;
         Viewer readViewer = repository.read("dylan@gmail.com");
        /*System.out.println(viewer.getComment());*/
 /*       assertEquals("Master01", readViewer.getPassword());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        // Suggestion suggestion = repository.read("1");

   //     Viewer newViewer = new Viewer.Builder()
     //           .name(/*(String) values.get("name")*///"master")
       //         .password("Newmaster01"/*(String) values.get("password")*/)//update password
           /*     .email((String) values.get("email"))
                .comment((List<Comment>) values.get("comment"))
                .favouriteRecipes((List<FavouriteRecipes>) values.get("favouriteRecipes"))
                .rep((Integer) values.get("rep"))
                .date((Date) values.get("date"))
                .build();*/

       /* Viewer newViewer = new Viewer.Builder()
                .description((String) values.get("description"))
                .mixer((Mixer) values.get("mixer"))
                .date((Date) values.get("date"))
                .sug_id((Integer) values.get("sug_id"))
                .build();*/
  /*      repository.update(newViewer);

        Viewer UpdateViewer = repository.read("dylan@gmail.com");

        assertEquals("Newmaster01", UpdateViewer.getPassword());
    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {*/
        // i++;
        //System.out.println("delete" + i);
   /*     Viewer nviewer = repository.read("master");
        assertEquals("Newmaster01", nviewer.getPassword());
        //System.out.println(viewer.getEmail());
       /* repository.delete("dylan@gmail.com");*/
       // System.out.println(viewer.getPassword());
       // viewer = repository.read("dylan@gmail.com");
        //   System.out.println(person.getLastname());
       // assertNull(viewer);
        //  System.out.println("delete" + i);
        //Failure
 /*   }*/

}