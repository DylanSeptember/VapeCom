package com.VapeRepo.Services.Impl;

import com.VapeRepo.Domain.Suggestion;
import com.VapeRepo.Repositories.Impl.SuggestionRepositoryImpl;
import com.VapeRepo.Repositories.SuggestionRepository;
import com.VapeRepo.Services.Interfaces.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dylan on 8/14/2017.
 */
@Component
public class SuggestionServiceImpl implements SuggestionService {


    @Autowired
    private SuggestionRepository suggestionRepository;

    @Override
    public Suggestion save(Suggestion entity) {
        return suggestionRepository.save(entity);
    }

    @Override
    public Suggestion findById(Integer s) {
        return suggestionRepository.findOne(s);
    }

    @Override
    public Suggestion update(Integer s) {
        return null;
    }


    /*
    SuggestionRepository repository;

    public SuggestionServiceImpl(){
        // service = new ViewerServiceImpl();
        repository = new SuggestionRepositoryImpl();
    }

    public Suggestion create(Suggestion suggestion) {
        return repository.create(suggestion);
    }

    public Suggestion read(int sug_id) {
        return repository.read(sug_id);
    }

    public Suggestion update(Suggestion suggestion) {
        return repository.update(suggestion);
    }

    public void delete(int sug_id) {
        repository.delete(sug_id);

    }*/

}
