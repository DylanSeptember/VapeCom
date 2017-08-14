package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Mixer;
import com.VapeRepo.Domain.Recipe;
import com.VapeRepo.Domain.Viewer;

import java.util.List;
import java.util.Map;

/**
 * Created by dylan on 8/13/2017.
 */
public class MixerFactory {
    public static Mixer getRecipe(Map<String, Object> values){

       /* Viewer viewer = new Viewer.Builder()*/

        Mixer mixer = new Mixer.Builder()
                .recipes((List<Recipe>) values.get("recipes"))
                .viewer((Viewer) values.get("viewer"))
                .build();
        return mixer;
    }
}
