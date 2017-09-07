package com.VapeRepo.Services.Impl;

import com.VapeRepo.Domain.Response;
import com.VapeRepo.Repositories.ResponseRepository;
import com.VapeRepo.Services.Interfaces.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by dylan on 9/3/2017.
 */
@Component
public class ResponseServiceImpl implements ResponseService {
    @Autowired
    private ResponseRepository responseRepository;

    @Override
    public Response save( Response entity) {
        return responseRepository.save(entity);
    }

    @Override
    public Response findById(Integer s) {
        return responseRepository.findOne(s);
    }

    @Override
    public Response update(Integer s) {
        return null;
    }

    public List<Response> getResponse(Integer id){

//        List<Comment> comments = new ArrayList<>();
//        commentRepository.findByViewerId(id)
        return responseRepository.findByCommentId(id);
    }

}
