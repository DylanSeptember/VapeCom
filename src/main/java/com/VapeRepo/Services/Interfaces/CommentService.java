package com.VapeRepo.Services.Interfaces;

import com.VapeRepo.Domain.Comment;
import com.VapeRepo.Services.BaseService;

import java.util.List;

/**
 * Created by dylan on 8/25/2017.
 */
public interface CommentService extends BaseService<Comment, Integer> {
    public List<Comment> getComment(String id);
}
