package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Comment;
import com.VapeRepo.Domain.FavouriteRecipes;
import com.VapeRepo.Domain.Viewer;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by dylan on 8/13/2017.
 */
public class ViewerFactory {

    public static Viewer getViewer(Map<String, Object> values){

                Viewer viewer = new Viewer.Builder()
                .name((String) values.get("name"))
                .password((String) values.get("password"))
                .email((String) values.get("email"))
                .comment((List<Comment>) values.get("comment"))
                .favouriteRecipes((List<FavouriteRecipes>) values.get("favouriteRecipes"))
                .rep((Integer) values.get("rep"))
                .date((Date) values.get("date"))
                .build();
        return viewer;
    }
}
