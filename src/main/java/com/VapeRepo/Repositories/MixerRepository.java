package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Mixer;
import com.VapeRepo.Domain.Viewer;

/**
 * Created by dylan on 8/13/2017.
 */
public interface MixerRepository {
    Mixer create(Mixer mixer);
    Mixer read(Viewer viewer);
    Mixer update(Mixer mixer);
    void delete(Viewer viewer);
}
