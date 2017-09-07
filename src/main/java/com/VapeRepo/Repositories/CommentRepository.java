package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by dylan on 8/25/2017.
 */
public interface CommentRepository extends CrudRepository<Comment, Integer> {

    public List<Comment> findByViewerEmail(String email);
    public List<Comment> findByRecipeId(Integer Id);
}
