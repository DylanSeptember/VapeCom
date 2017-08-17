package com.VapeRepo.Repositories.Impl;

import com.VapeRepo.Domain.Suggestion;
import com.VapeRepo.Repositories.SuggestionRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dylan on 8/13/2017.
 */
public class SuggestionRepositoryImpl /*implements SuggestionRepository */{

    Map<Integer, Suggestion> suggestionTable;

    public SuggestionRepositoryImpl(){
        suggestionTable = new HashMap<Integer, Suggestion>();
    }

    public Suggestion create(Suggestion suggestion) {

        suggestionTable.put(suggestion.getSug_id(), suggestion);
        Suggestion savedPerson = suggestionTable.get(suggestion.getSug_id());
        return savedPerson;
    }

    public Suggestion read(int sug_id) {
        Suggestion suggestion = suggestionTable.get(sug_id);
        System.out.println(" The Suggestion Object is "+suggestion);

        return suggestion;
    }

    public Suggestion update(Suggestion suggestion) {
        suggestionTable.put(suggestion.getSug_id(), suggestion);
        Suggestion savedPerson = suggestionTable.get(suggestion.getSug_id());
        return savedPerson;
    }

    public void delete(int sug_id) {
        suggestionTable.remove(sug_id);
    }
}
