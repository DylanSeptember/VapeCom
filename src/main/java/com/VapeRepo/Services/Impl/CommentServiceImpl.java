package com.VapeRepo.Services.Impl;

import com.VapeRepo.Domain.Comment;
import com.VapeRepo.Repositories.CommentRepository;
import com.VapeRepo.Services.Interfaces.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dylan on 8/25/2017.
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment save(Comment entity) {
        return commentRepository.save(entity);
    }

    @Override
    public Comment findById(Integer s) {
        return commentRepository.findOne(s);
    }

    @Override
    public Comment update(Integer s) {
        return null;
    }

    @Override
    public List<Comment> getComment(String id){

//        List<Comment> comments = new ArrayList<>();
//        commentRepository.findByViewerId(id)
        return commentRepository.findByViewerEmail(id);
    }


    public List<Comment> getCommentByRecipe(Integer id){

//        List<Comment> comments = new ArrayList<>();
//        commentRepository.findByViewerId(id)
        return commentRepository.findByRecipeId(id);
    }
    //public List<Comment> findByRecipeId(Integer Id);
}
