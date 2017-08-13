package com.VapeRepo.Repositories;

/**
 * Created by dylan on 8/13/2017.
 */
public interface MixerRepository {
    Mixer create(Mixer mixer);
    Mixer read(int recipe_id);
    Mixer update(Mixer mixer);
    void delete(int recipe_id);
}
