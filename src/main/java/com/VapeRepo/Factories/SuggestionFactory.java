package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Mixer;
import com.VapeRepo.Domain.Suggestion;

import java.util.Date;
import java.util.Map;

/**
 * Created by dylan on 8/13/2017.
 */
public class SuggestionFactory {

    public static Suggestion getSuggestion(Map<String, Object> values){

        Suggestion suggestion = new Suggestion.Builder()
                .description((String) values.get("description"))
                .mixer((Mixer) values.get("mixer"))
                .date((Date) values.get("date"))
                .sug_id((Integer) values.get("sug_id"))
                .build();
        return suggestion;
    }
}
