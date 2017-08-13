package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Mixer;
import com.VapeRepo.Domain.Suggestion;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by dylan on 8/13/2017.
 */
public class SuggestionFactoryTest {
    Map<String, Object> values;
   /* List<Comment> comment;
    List<FavouriteRecipes> favouriteRecipes;*/
    Mixer mixer = new Mixer();
    Date date = new Date();

    @Before
    public void setUp() throws Exception{
        values = new HashMap<String, Object>();
        values.put("description", "make more bread");
        values.put("mixer", mixer);
        values.put("date", date);
        values.put("sug_id", 005);

    }

    @Test
    public void getsug_idFalse() throws Exception {
        Suggestion suggestion = SuggestionFactory.getSuggestion(values);
        assertEquals(4, suggestion.getSug_id());
    }

    @Test
    public void getsug_idTrue() throws Exception {
        Suggestion suggestion = SuggestionFactory.getSuggestion(values);
        assertEquals(005, suggestion.getSug_id());
    }
}
