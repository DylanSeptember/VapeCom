package com.VapeRepo.Services;

import com.VapeRepo.Domain.Mixer;
import com.VapeRepo.Domain.Viewer;

/**
 * Created by dylan on 8/14/2017.
 */
public interface MixerService {
    Mixer create(Mixer mixer);
    Mixer read(Viewer viewer);
    Mixer update(Mixer mixer);
    void delete (Viewer viewer);
}
