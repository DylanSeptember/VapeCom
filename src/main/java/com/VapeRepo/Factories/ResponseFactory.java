package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Comment;
import com.VapeRepo.Domain.Recipe;
import com.VapeRepo.Domain.Response;
import com.VapeRepo.Domain.Viewer;

import java.util.Date;
import java.util.Map;

/**
 * Created by dylan on 9/3/2017.
 */
public class ResponseFactory {
    public static Response buildResponse(Map<String, Object> values){

        Response response = new Response.Builder()
                .responseDate((Date) values.get("responseDate"))
                .description((String) values.get("description"))
                .viewer((Viewer) values.get("viewer"))
                .comment((Comment) values.get("comment"))
                .build();
        return response;
    }
}
