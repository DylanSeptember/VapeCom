//package com.VapeRepo.Repositories.Impl;
//
//import com.VapeRepo.Domain.Mixer;
//import com.VapeRepo.Domain.Suggestion;
//import com.VapeRepo.Factories.SuggestionFactory;
//import com.VapeRepo.Repositories.SuggestionRepository;
//import org.junit.Before;
////import org.junit.Test;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//import static org.junit.Assert.*;
//
///**
// * Created by dylan on 8/13/2017.
// */
//public class SuggestionRepositoryImplTest {
//
// /*   Map<String, Object> values;
//    SuggestionRepository repository;
//    Mixer mixer;
//    Date date;
//    Suggestion suggestion;
//    @BeforeMethod
//    public void setUp() throws Exception{
//
//        repository = new SuggestionRepositoryImpl();
//        values = new HashMap<String, Object>();
//        values.put("description", "make less bread");
//        values.put("mixer", mixer);
//        values.put("date", date);
//        values.put("sug_id", 845);
//
//
//        suggestion = SuggestionFactory.getSuggestion(values);
//        repository.create(suggestion);
//
//    }
//
//    @Test
//    public void create() throws Exception {
//        // i++;
//        //Suggestion suggestion = SuggestionFactory.getSuggestion(values);
//        repository.create(suggestion);
//        Suggestion createdSuggestion = repository.read(845);
//        assertEquals("make less bread", createdSuggestion.getDescription());
//
//        // System.out.println("create" + i);
//
//    }
//
//    @Test(dependsOnMethods = "create")
//    public void read() throws Exception {
//        // i++;
//        Suggestion readSuggestion = repository.read(845);
//        System.out.println(suggestion.getDescription());
//        assertEquals("make less bread", readSuggestion.getDescription());
//    }
//
//    @Test(dependsOnMethods = "read")
//    public void update() throws Exception {
//       // Suggestion suggestion = repository.read("1");
//        Suggestion newSuggestion = new Suggestion.Builder()
//                .description((String) values.get("description"))
//                .mixer((Mixer) values.get("mixer"))
//                .date((Date) values.get("date"))
//                .sug_id((Integer) values.get("sug_id"))
//                .build();
//
//        repository.update(newSuggestion);
//
//        Suggestion UpdateSuggestion = repository.read(845);
//
//        assertEquals("make less bread", UpdateSuggestion.getDescription());
//    }
//
//    @Test(dependsOnMethods = "update")
//    public void delete() throws Exception {
//        // i++;
//        //System.out.println("delete" + i);
//        Suggestion suggestion = repository.read(845);
//        System.out.println(suggestion.getSug_id());
//        repository.delete(845);
//        System.out.println(suggestion.getDescription());
//        suggestion = repository.read(845);
//        //   System.out.println(person.getLastname());
//        assertNull(suggestion);
//        //  System.out.println("delete" + i);
//    }*/
//
//}