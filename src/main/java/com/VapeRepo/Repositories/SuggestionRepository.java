package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Suggestion;

/**
 * Created by dylan on 8/13/2017.
 */
public interface SuggestionRepository {
    Suggestion create(Suggestion viewer);
    Suggestion read(int sug_id);
    Suggestion update(Suggestion viewer);
    void delete(int sug_id);
}
