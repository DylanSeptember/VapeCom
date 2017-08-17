package com.VapeRepo.Repositories;

import com.VapeRepo.Domain.Mixer;
import com.VapeRepo.Domain.Viewer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dylan on 8/13/2017.
 */
public interface MixerRepository extends CrudRepository<Mixer, Integer> {
  /*  Mixer create(Mixer mixer);
    Mixer read(Viewer viewer);
    Mixer update(Mixer mixer);
    void delete(Viewer viewer);*/
}
