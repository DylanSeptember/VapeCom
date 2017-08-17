package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Suggestion;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dylan on 8/13/2017.
 */
public interface SuggestionRepository extends CrudRepository<Suggestion, Integer> {
   /* Suggestion create(Suggestion viewer);
    Suggestion read(int sug_id);
    Suggestion update(Suggestion viewer);
    void delete(int sug_id);*/
}
