package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Comment;
import com.VapeRepo.Domain.Recipe;
import com.VapeRepo.Domain.Viewer;

import java.util.Date;
import java.util.Map;

/**
 * Created by dylan on 8/25/2017.
 */
public class CommentFactory {
    public static Comment buildComment(Map<String, Object> values){

        Comment comment = new Comment.Builder()
           //     .comment_id((Integer) values.get("comment_id"))
                .commentDate((Date) values.get("commentDate"))
                .description((String) values.get("description"))
                .viewer((Viewer) values.get("viewer"))
                .recipe((Recipe) values.get("recipe"))
                .build();
        return comment;
    }
}
