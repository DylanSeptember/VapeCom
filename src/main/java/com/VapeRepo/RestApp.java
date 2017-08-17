package com.VapeRepo;

import com.VapeRepo.Domain.Comment;
import com.VapeRepo.Domain.FavouriteRecipes;
import com.VapeRepo.Domain.Viewer;
import com.VapeRepo.Factories.ViewerFactory;
import com.VapeRepo.Services.Impl.ViewerServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dylan on 8/17/2017.
 */
@Controller
@RequestMapping(path="/secrest")
public class RestApp {
    @Autowired
    private ViewerServiceImpl viewerService;
    HashMap<String, Object> values;
    Comment comment;
    FavouriteRecipes favouriteRecipes;
    Date date;

    @GetMapping(path="/add/{countryName}")
    public @ResponseBody
    String addCountry(@PathVariable String email){

        values = new HashMap<String, Object>();
        values.put("name", "Dylan");
        values.put("password", "Master01");
        values.put("email", "dylanseptember@gmail.com");
        values.put("comment", comment);
        values.put("favouriteRecipes", favouriteRecipes);
        values.put("rep", 100);
        values.put("date", date);

        Viewer viewer = ViewerFactory.getViewer( values);

        viewerService.save(viewer);
        return new Gson().toJson(viewer);

       /* Viewer viewer = new Viewer.Builder()
                .name((String) values.get("name"))
                .password((String) values.get("password"))
                .email((String) values.get("email"))
                .comment((List<Comment>) values.get("comment"))
                .favouriteRecipes((List<FavouriteRecipes>) values.get("favouriteRecipes"))
                .rep((Integer) values.get("rep"))
                .date((Date) values.get("date"))
                .build();*/
    }
}
