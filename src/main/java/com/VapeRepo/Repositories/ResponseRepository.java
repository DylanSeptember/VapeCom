package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Response;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by dylan on 9/3/2017.
 */
public interface ResponseRepository extends CrudRepository<Response, Integer> {
    public List<Response> findByCommentId(Integer Id);
}