package com.VapeRepo.Services;

import com.VapeRepo.Domain.Suggestion;

/**
 * Created by dylan on 8/14/2017.
 */
public interface SuggestionService {
    Suggestion create(Suggestion suggestion);
    Suggestion read(int sug_id);
    Suggestion update(Suggestion suggestion);
    void delete (int sug_id);
}
