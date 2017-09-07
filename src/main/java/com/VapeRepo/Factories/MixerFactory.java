package com.VapeRepo.Factories;

import com.VapeRepo.Domain.Mixer;
//import com.VapeRepo.Domain.Recipe;
import com.VapeRepo.Domain.Viewer;

import java.util.List;
import java.util.Map;

/**
 * Created by dylan on 8/13/2017.
 */
public class MixerFactory {
    public static Mixer buildMixer(/*Map<String, Object> values*/Viewer viewer){

       /* Viewer viewer = new Viewer.Builder()*/

        Mixer mixer = new Mixer.Builder()
              //  .recipes((List<Recipe>) values.get("recipes"))
//                .email((String)values.get("email"))
//                .viewer((Viewer)values.get("viewer"))
                .viewer(viewer)
                .build();
        return mixer;
    }
}
