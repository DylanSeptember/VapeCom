package com.VapeRepo.Services.Impl;

import com.VapeRepo.Domain.Mixer;
import com.VapeRepo.Domain.Suggestion;
import com.VapeRepo.Factories.SuggestionFactory;
import com.VapeRepo.Services.SuggestionService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by dylan on 8/14/2017.
 */
public class SuggestionServiceImplTest {
    SuggestionService service;
    Map<String, Object> values;
    Mixer mixer;
    Date date;

    @BeforeMethod
    public void setUp() throws Exception {
       /* service = new SuggestionServiceImpl();
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("firstname","John");
        values.put("lastname","Deo");*/

        service = new SuggestionServiceImpl();
        values = new HashMap<String, Object>();
        values.put("description", "make less bread");
        values.put("mixer", mixer);
        values.put("date", date);
        values.put("sug_id", 845);
    }

    @Test
    public void testCreate() throws Exception {
        Suggestion suggestion = SuggestionFactory.getSuggestion(values);
        service.create(suggestion);
        assertEquals("make less bread",service.getDescription());
    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {
        Suggestion readSuggestion = service.read("1");
        assertEquals(25,readSuggestion.getAge());
    }

    @Test(dependsOnMethods = "testRead")
    public void testUpdate() throws Exception {
        Suggestion suggestion = service.read("1");
        Suggestion newPerson = new Suggestion.Builder()
                .age(22)
                .firstname(values.get("firstname"))
                .lastname(values.get("lastname"))
                .id(values.get("id"))
                .build();
        service.update(newPerson);
        Suggestion UpdatePerson = service.read("1");
        assertEquals(22,UpdatePerson.getAge());
    }

    @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        service.delete("1");
        Suggestion suggestion = service.read("1");
        assertNull(Suggestion);
    }

}