package com.VapeRepo.Repositories.Impl;

import com.VapeRepo.Domain.Mixer;
import com.VapeRepo.Domain.Recipe;
import com.VapeRepo.Domain.Viewer;
import com.VapeRepo.Repositories.MixerRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dylan on 8/14/2017.
 */
public class MixerRepositoryImpl /*implements MixerRepository*/{
    Map<Viewer, Mixer> mixerTable;

    public MixerRepositoryImpl() {
        mixerTable = new HashMap<Viewer, Mixer>();
    }

    public Mixer create(Mixer mixer) {
        mixerTable.put(mixer.getViewer(), mixer);
        Mixer savedMixer = mixerTable.get(mixer.getViewer());
        return savedMixer;
    }

    public Mixer read(Viewer viewer) {
        Mixer mixer = mixerTable.get(viewer);
        System.out.println(" The Recipe Object is " + viewer);

        return mixer;
    }

    public Mixer update(Mixer mixer) {
        mixerTable.put(mixer.getViewer(), mixer);
        Mixer savedMixer = mixerTable.get(mixer.getViewer());
        return savedMixer;
    }

    public void delete(Viewer viewer) {
        mixerTable.remove(viewer);
    }
}
